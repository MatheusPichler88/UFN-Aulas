package com.mathlab.controller;

import com.mathlab.model.CalculoModel;
import com.mathlab.service.CalculoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculoController {

    private final CalculoService service;

    public CalculoController(CalculoService service) {
        this.service = service;
    }

    // Carrega o dashboard inicial
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("sistema", new CalculoModel());
        return "index";
    }

    // Endpoint para resolver o sistema linear
    @PostMapping("/resolver")
    public String resolver(@ModelAttribute("sistema") CalculoModel dto, Model model) {

        // Validações de entrada
        int n = dto.getTamanho();
        if (n < 2 || n > 10) {
            model.addAttribute("erro", "Tamanho inválido (2-10).");
            model.addAttribute("sistema", dto);
            return "index";
        }
        if (dto.getTolerancia() <= 0) {
            model.addAttribute("erro", "Tolerância inválida.");
            model.addAttribute("sistema", dto);
            return "index";
        }
        if (dto.getMaxIteracoes() < 1) {
            model.addAttribute("erro", "Número de iterações deve ser > 0.");
            model.addAttribute("sistema", dto);
            return "index";
        }

        try {
            double[] resultado;
            double[][] A = new double[n][n];
            double[] b = new double[n];

            for (int i = 0; i < n; i++) {

                if (dto.getVetorB()[i] == null) {
                    model.addAttribute("erro", "Preencha todos os valores do vetor b.");
                    model.addAttribute("sistema", dto);
                    return "index";
                }

                b[i] = dto.getVetorB()[i];

                for (int j = 0; j < n; j++) {

                    if (dto.getMatrizA()[i][j] == null) {
                        model.addAttribute("erro", "Preencha toda a matriz A.");
                        model.addAttribute("sistema", dto);
                        return "index";
                    }

                    A[i][j] = dto.getMatrizA()[i][j];
                }
            }

            switch (dto.getMetodo()) {
                case "jacobi":
                    resultado = service.resolverJacobi(
                            A, b, n,
                            dto.getTolerancia(), dto.getMaxIteracoes(), dto
                    );
                    break;

                case "seidel":
                    resultado = service.resolverGaussSeidel(
                            A, b, n,
                            dto.getTolerancia(), dto.getMaxIteracoes(), dto
                    );
                    break;

                case "gauss":
                default:
                    resultado = service.resolverGauss(
                            A, b, n
                    );
                    dto.setIteracoesRealizadas(1);
                    dto.setConvergiu(true);
                    break;
            }

            // Tratamento de convergência para métodos iterativos
            if (!dto.isConvergiu()) {
                model.addAttribute("avisoConvergencia",
                        "Estourou o limite de " + dto.getMaxIteracoes() + " iterações.");
            }

            model.addAttribute("resultado", resultado);

        } catch (ArithmeticException e) {
            model.addAttribute("erro", "Erro Matemático: " + e.getMessage());

        } catch (Exception e) {
            model.addAttribute("erro", "Erro inesperado. Verifique os campos.");
        }

        model.addAttribute("sistema", dto);
        return "index";
    }
}