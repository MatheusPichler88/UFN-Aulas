#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <time.h>

typedef struct {
    int row;
    int cols;
    float **A, **B, **C;
} ThreadData;

// Função  threads
void* sum_rows(void* arg) {
    ThreadData* data = (ThreadData*)arg;

    for (int j = 0; j < data->cols; j++) {
        data->C[data->row][j] =
            data->A[data->row][j] + data->B[data->row][j];
    }

    pthread_exit(NULL);
}

int main() {
    int N, M;

    printf("Informe as dimensões N e M: ");
    if (scanf("%d %d", &N, &M) != 2 || N <= 0 || M <= 0) {
        printf("Entrada inválida.\n");
        return 1;
    }

    
    srand(time(NULL));

    
    float **A = malloc(N * sizeof(float*));
    float **B = malloc(N * sizeof(float*));
    float **C = malloc(N * sizeof(float*));

    if (!A || !B || !C) {
        printf("Erro de alocação.\n");
        return 1;
    }

    for (int i = 0; i < N; i++) {
        A[i] = malloc(M * sizeof(float));
        B[i] = malloc(M * sizeof(float));
        C[i] = malloc(M * sizeof(float));

        if (!A[i] || !B[i] || !C[i]) {
            printf("Erro de alocação.\n");
            return 1;
        }

        for (int j = 0; j < M; j++) {
            A[i][j] = (float)(rand() % 10);
            B[i][j] = (float)(rand() % 10);
        }
    }

    pthread_t threads[N];
    ThreadData t_data[N];

    // threads
    for (int i = 0; i < N; i++) {
        t_data[i].row = i;
        t_data[i].cols = M;
        t_data[i].A = A;
        t_data[i].B = B;
        t_data[i].C = C;

        if (pthread_create(&threads[i], NULL, sum_rows, &t_data[i]) != 0) {
            printf("Erro ao criar thread %d\n", i);
            return 1;
        }
    }

    
    for (int i = 0; i < N; i++) {
        pthread_join(threads[i], NULL);
    }

    // matrizes 
    printf("\nMatriz A:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            printf("%.1f ", A[i][j]);
        }
        printf("\n");
    }

    printf("\nMatriz B:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            printf("%.1f ", B[i][j]);
        }
        printf("\n");
    }

    printf("\nMatriz C (Resultado = A + B):\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            printf("%.1f ", C[i][j]);
        }
        printf("\n");
    }


    for (int i = 0; i < N; i++) {
        free(A[i]);
        free(B[i]);
        free(C[i]);
    }
    free(A);
    free(B);
    free(C);

    printf("\nSoma concluída com sucesso.\n");

    return 0;
}


//Matheus Dias e Gabriel Gonzalez
//Uso de pthread para controlar as threads permitindo a execução paralela
//EXPLICACAO: Cada thread soma uma linha da matriz, não havendo conflito de memorio
//o programa gera matrizes, soma e exibe matrizes e resultado.
