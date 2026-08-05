#include <stdio.h>
#include <stdlib.h>

void gerarElementos(int** matriz, int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriz[i][j] = (i + j) % 10;
        }
    }
}

void calculosMatriz(int** matriz, int n, int* somaColuna, int* multiLinha, int* diagPrinc, int* diagSec) {
    *somaColuna = 0;
    *multiLinha = 1;
    *diagPrinc = 0;
    *diagSec = 0;
    int maiorValor = matriz[0][0];
    int qtdPos = 0;
    int PosMValor[n * n][2];

    for (int i = 0; i < n; i++) {
        *somaColuna += matriz[i][0];
        *multiLinha *= matriz[0][i];
        *diagPrinc += matriz[i][i];
        *diagSec += matriz[i][n - i - 1];

        for (int j = 0; j < n; j++) {
            if (matriz[i][j] > maiorValor) {
                maiorValor = matriz[i][j];
                qtdPos = 0;
                PosMValor[qtdPos][0] = i;
                PosMValor[qtdPos][1] = j;
                qtdPos = 1;
            } else if (matriz[i][j] == maiorValor) {
                PosMValor[qtdPos][0] = i;
                PosMValor[qtdPos][1] = j;
                qtdPos++;
            }
        }
    }

    printf("Maior valor na matriz: %d\n", maiorValor);
    printf("Posicoes do maior valor:\n");
    for (int i = 0; i < qtdPos; i++) {
        printf("Linha %d, Coluna %d\n", PosMValor[i][0], PosMValor[i][1]);
    }
}

int main() {
    int n;
    printf("Informe o tamanho da matriz NxN: ");
    scanf("%d", &n);

    int** matriz = malloc(n * sizeof(int*));
    for (int i = 0; i < n; i++) {
        matriz[i] = malloc(n * sizeof(int));
    }

    int somaColuna, multiLinha, diagPrinc, diagSec;

    gerarElementos(matriz, n);
    calculosMatriz(matriz, n, &somaColuna, &multiLinha, &diagPrinc, &diagSec);

    printf("Soma da primeira coluna: %d\n", somaColuna);
    printf("Multiplicacao da primeira linha: %d\n", multiLinha);
    printf("Soma da diagonal principal: %d\n", diagPrinc);
    printf("Soma da diagonal secundaria: %d\n", diagSec);

    for (int i = 0; i < n; i++) {
        free(matriz[i]);
    }
    free(matriz);

    return 0;
}
