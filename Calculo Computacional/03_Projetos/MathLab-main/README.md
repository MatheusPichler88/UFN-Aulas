# MathLab — Resolução de Sistemas Lineares

Aplicação web desenvolvida em **Java com Spring Boot** para resolução numérica de sistemas lineares do tipo **Ax = b**. O projeto foi criado como parte da disciplina de Cálculo Numérico e implementa três métodos clássicos de resolução, com interface web moderna e análise comparativa entre os métodos.

---

## Tecnologias

| Camada | Tecnologia |
|---|---|
| Backend | Java 17 + Spring Boot 3.2.5 |
| Template engine | Thymeleaf |
| Frontend | HTML5, Bootstrap 5.3, CSS3, JavaScript |
| Build | Maven |

---

## Métodos Implementados

### Eliminação de Gauss
Método direto com pivotamento parcial. Monta a matriz aumentada `[A | b]`, elimina os elementos abaixo da diagonal e aplica substituição retroativa. Resolve o sistema em exatamente uma iteração e lança `ArithmeticException` caso a matriz seja singular.

### Método de Jacobi
Método iterativo que calcula cada variável `x[i]` usando apenas os valores da iteração anterior. Verifica se a matriz é diagonalmente dominante antes de iniciar (condição suficiente para convergência) e interrompe quando o erro máximo entre iterações é menor que a tolerância informada.

### Gauss-Seidel
Variação do Jacobi que utiliza os valores já atualizados na mesma iteração, geralmente convergindo mais rapidamente. Aplica a mesma verificação de diagonal dominante e critério de parada por tolerância.

---

## Estrutura do Projeto

```
src/
└── main/
    ├── java/com/mathlab/
    │   ├── MathLabApplication.java       # Ponto de entrada Spring Boot
    │   ├── controller/
    │   │   └── CalculoController.java    # Rotas GET / e POST /resolver
    │   ├── model/
    │   │   └── CalculoModel.java         # DTO: matriz A, vetor b, parâmetros
    │   └── service/
    │       └── CalculoService.java       # Implementação dos três métodos
    └── resources/
        ├── templates/
        │   └── index.html                # Interface web (Thymeleaf)
        └── application.properties
```

---

## Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.6+

### Passos

```bash
# Clone o repositório
git clone <url-do-repositorio>
cd MathLab

# Execute com Maven Wrapper
./mvnw spring-boot:run

# Ou no Windows
mvnw.cmd spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

---

## Como Usar

1. Informe o **tamanho n** do sistema (entre 2 e 10).
2. Selecione o **método de resolução**.
3. Para Jacobi e Gauss-Seidel, defina a **tolerância** (ex: `0.0001`) e o **máximo de iterações** (ex: `100`).
4. Preencha a **matriz A** e o **vetor b** na grade interativa.
5. Clique em **Calcular Solução**.
6. Para comparar os três métodos simultaneamente, clique em **Simular todos os métodos** na seção de análise comparativa.

---

## Exemplo de Teste

Sistema 3x3 com solução inteira:

```
Matriz A:        Vetor b:
 2   1  -1        8
-3  -1   2       -11
-2   1   2       -3
```

Solução esperada: **x1 = 2, x2 = 3, x3 = -1**

---

## Observações

- Para matrizes que não são diagonalmente dominantes, Jacobi e Gauss-Seidel podem não convergir. Nesse caso, um aviso é exibido na tela.
- A Eliminação de Gauss sempre produz resultado (quando a matriz não é singular), independente de diagonal dominante.
- O limite de tamanho é `n = 10` por questões de usabilidade da grade visual.

---

## Autor

Desenvolvido por **Matheus Pichler** e **Gabriel Gonzalez** para a disciplina de Cálculo Numérico — CC &copy; 2026
