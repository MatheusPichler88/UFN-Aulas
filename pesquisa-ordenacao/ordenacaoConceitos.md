# Ordenação

# Conceitos e Fundamentos
    - O que é ordenar: organizar uma estrutura de dados (cresc ou desc) usando uma ou mais chaves de controles (variável)
    - Por que ordenar? porque estruturas ordenadas tem a busca ou a pesquisa mais eficiente, devido aos algoritmos baseados em árvores
    - Categorias de ordenação para os algoritmos
         - memória interna ou memória externa
         - estabilidade do algoritmo
            Estável: o processo de ordenação sempre garante a ordenação temporária da estrutura
                [4, 8, 1, 3, 4, 2]
                [4, 1, 3, 4, 2, 8]
                [1, 3, 4, 2, 4, 8]
                [1, 3, 2, 4, 4, 8]
                [1, 2, 3, 4, 4, 8]
                [1, 2, 3, 4, 4, 8]

            Instável: o processo de ordenação não garante a ordenação temporária da estrutura
                [4, 8, 1, 3, 4, 2]
                [1, 8, 4, 3, 4, 2]
                [1, 2, 4, 3, 4, 8]
                [1, 2, 3, 4, 4, 8]
                [1, 2, 3, 4, 4, 8]
                [1, 2, 3, 4, 4, 8]
                Adequados para listas feitas em C ou C++ com alocação dinâmica de memória, como trabalhado na disciplina Estrutura de Dados

            Obs.: ao ordenar, os algoritmos garantem porções ordenadas na estrutura:
                - final
                - início
                - nas extremidades (pirâmide invertida)
        - complexidade: é a quantidade de esforço computacional (tarefas, rotinas, métodos) envolvido no algoritmo
            - Na ordenação, a complexidade dos algoritmos é medida pela quantidade:
                - comparações
                - trocas
                Categorias: 
                    Complexidade fatorial    - O(n!)    - menos eficiente
                    Complexidade ??          - O(n^k)
                    Complexidade Exponencial - O(n^2)
                    Complexidade Linear      - O(n)
                    Complexidade Logarítmica - O(log n) - mais eficaz

## Atividade de fixação
    1) Pesquisar na literatura, internet ou IA Generativa sobre os métodos de ordenação e categorizá-los em:
        - Algoritmo de memória interna ou memória externa
        - Estabilidade (estável ou instável)
        - Complexidade
        - Porções de ordenação

    Pesquisar os seguintes métodos de ordenação (ordem de potência):
        - bolha (bubble sort)
            - memória interna
            - estável
            - O(n^2)
            - porção ordenada: final
        - seleção (selection sort)
            - memória interna
            - instável
            - O(n^2)
            - porção ordenada: início
        - inserção (inserction sort)
            - memória interna
            - estável
            - O(n^2)
            - porção ordenada: início
        - pente (combsort)
            - memória interna
            - instável
            - O(n^2)
            - porção ordenada: extremidades
        - agitação (shakesort ou cocktailsort)
            - memória interna
            - estável
            - O(n^2)
            - porção ordenada: extremidades
        - shellsort
            - memória interna
            - instável
            - O(n log n)
            - porção ordenada: extremidades
        - bucketsort
            - memória externa
            - estável
            - O(n^2)
            - porção ordenada: início
        - radix
            - memória externa
            - estável
            - O(n*k)
            - porção ordenada: início
        - heapsort
            - memória interna
            - instável
            - O(n log n)
            - porção ordenada: final
        - mergesort
            - memória externa
            - estável
            - O(n log n)
            - porção ordenada: extremidades
        - quicksort
            - memória interna
            - instável
            - O(n log n)
            - porção ordenada: extremidades
        



# Comentários
    eficiente vs eficaz
        - ambos atingem objetivos

    Qual o melhor algoritmo de ordenação?
        Depende:
            - tamanho da estrutura
            - do quanto já está ordenado
    
    Cenários de um processo de ordenação
        - pior caso
            bolha - lista ordenada decrescente e se desejar ordenar crescente
            seleção - lista ordenada
            inserção - lista ordenada decrescente e se desejar ordenar crescente