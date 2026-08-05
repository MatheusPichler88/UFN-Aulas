package com.mathlab.service;

import com.mathlab.model.CalculoModel;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class CalculoService {

    // Eliminação de Gauss com pivotamento
    public double[] resolverGauss(double[][] A, double[] b, int n) {

        // Monta a matriz aumentada [A | b]
        double[][] M = new double[n][n + 1];
        for (int i = 0; i < n; i++) {
            System.arraycopy(A[i], 0, M[i], 0, n);
            M[i][n] = b[i];
        }

        for (int i = 0; i < n; i++) {

            // Busca o maior pivô na coluna
            int maxLinha = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(M[k][i]) > Math.abs(M[maxLinha][i])) {
                    maxLinha = k;
                }
            }

            // Swap de linhas
            double[] temp = M[i];
            M[i] = M[maxLinha];
            M[maxLinha] = temp;

            if (Math.abs(M[i][i]) < 1e-12) {
                throw new ArithmeticException("Matriz singular: sistema sem solução única.");
            }

            // Zera os elementos abaixo do pivô
            for (int j = i + 1; j < n; j++) {
                double fator = M[j][i] / M[i][i];
                for (int k = i; k <= n; k++) {
                    M[j][k] -= fator * M[i][k];
                }
            }
        }

        // Substituição retroativa
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double soma = M[i][n];
            for (int j = i + 1; j < n; j++) {
                soma -= M[i][j] * x[j];
            }
            x[i] = soma / M[i][i];
        }

        return x;
    }

    // Método de Jacobi
    public double[] resolverJacobi(double[][] A, double[] b, int n,
                                   double tol, int maxIter, CalculoModel dto) {

        // Checa se a matriz converge por diagonal dominante
        if (!isDiagonalmenteDominante(A, n)) {
            dto.setAviso("Matriz não é diagonal dominante. Pode não convergir.");
        }

        for (int i = 0; i < n; i++) {
            if (Math.abs(A[i][i]) < 1e-12) {
                throw new ArithmeticException("Zero na diagonal da linha " + (i+1));
            }
        }

        double[] x = new double[n];
        double[] xNovo = new double[n];
        int k;

        for (k = 0; k < maxIter; k++) {
            for (int i = 0; i < n; i++) {
                double soma = b[i];
                for (int j = 0; j < n; j++) {
                    if (i != j) soma -= A[i][j] * x[j];
                }
                xNovo[i] = soma / A[i][i];
            }

            if (erroMaximo(x, xNovo) < tol) {
                k++;
                dto.setConvergiu(true);
                break;
            }

            x = Arrays.copyOf(xNovo, n);
        }

        if (k == maxIter) dto.setConvergiu(false);

        dto.setIteracoesRealizadas(k);
        return Arrays.copyOf(xNovo, n);
    }

    // Método de Gauss-Seidel
    public double[] resolverGaussSeidel(double[][] A, double[] b, int n,
                                        double tol, int maxIter, CalculoModel dto) {

        if (!isDiagonalmenteDominante(A, n)) {
            dto.setAviso("Matriz não é diagonal dominante.");
        }

        for (int i = 0; i < n; i++) {
            if (Math.abs(A[i][i]) < 1e-12) {
                throw new ArithmeticException("Zero na diagonal da linha " + (i+1));
            }
        }

        double[] x = new double[n];
        int k;

        for (k = 0; k < maxIter; k++) {
            double[] xAnterior = Arrays.copyOf(x, n);

            // Usa valores já atualizados na própria iteração
            for (int i = 0; i < n; i++) {
                double soma = b[i];
                for (int j = 0; j < n; j++) {
                    if (i != j) soma -= A[i][j] * x[j];
                }
                x[i] = soma / A[i][i];
            }

            if (erroMaximo(xAnterior, x) < tol) {
                k++;
                dto.setConvergiu(true);
                break;
            }
        }

        if (k == maxIter) dto.setConvergiu(false);

        dto.setIteracoesRealizadas(k);
        return x;
    }

    // Métodos auxiliares
    private double erroMaximo(double[] antigo, double[] novo) {
        double max = 0;
        for (int i = 0; i < antigo.length; i++) {
            max = Math.max(max, Math.abs(novo[i] - antigo[i]));
        }
        return max;
    }

    private boolean isDiagonalmenteDominante(double[][] A, int n) {
        for (int i = 0; i < n; i++) {
            double somaFora = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) somaFora += Math.abs(A[i][j]);
            }
            if (Math.abs(A[i][i]) <= somaFora) return false;
        }
        return true;
    }
}