#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <time.h>

typedef struct {
    int row;
    int N;
    float **A;
    float *x;
    float *y;
} ThreadData;

// Cada thread calcula uma posição do vetor resultado
void* multiply_row(void* arg) {
    ThreadData* data = (ThreadData*)arg;

    int i = data->row;
    data->y[i] = 0;

    for (int j = 0; j < data->N; j++) {
        data->y[i] += data->A[i][j] * data->x[j];
    }

    pthread_exit(NULL);
}

int main() {
    int N;

    printf("Informe o tamanho N: ");
    if (scanf("%d", &N) != 1 || N <= 0) {
        printf("Entrada inválida.\n");
        return 1;
    }

    srand(time(NULL));

    
    float **A = malloc(N * sizeof(float*));
    float *x = malloc(N * sizeof(float));
    float *y = malloc(N * sizeof(float));

    if (!A || !x || !y) {
        printf("Erro de alocação.\n");
        return 1;
    }

    for (int i = 0; i < N; i++) {
        A[i] = malloc(N * sizeof(float));
        if (!A[i]) {
            printf("Erro de alocação.\n");
            return 1;
        }

        for (int j = 0; j < N; j++) {
            A[i][j] = rand() % 10;
        }
    }

    //vetor
    for (int i = 0; i < N; i++) {
        x[i] = rand() % 10;
    }

    pthread_t threads[N];
    ThreadData t_data[N];

    //threads
    for (int i = 0; i < N; i++) {
        t_data[i].row = i;
        t_data[i].N = N;
        t_data[i].A = A;
        t_data[i].x = x;
        t_data[i].y = y;

        if (pthread_create(&threads[i], NULL, multiply_row, &t_data[i]) != 0) {
            printf("Erro ao criar thread %d\n", i);
            return 1;
        }
    }

    //fim da thread
    for (int i = 0; i < N; i++) {
        pthread_join(threads[i], NULL);
    }

    
    printf("\nMatriz A:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%.1f ", A[i][j]);
        }
        printf("\n");
    }

    printf("\nVetor x:\n");
    for (int i = 0; i < N; i++) {
        printf("%.1f ", x[i]);
    }

    printf("\n\nVetor resultado y = A * x:\n");
    for (int i = 0; i < N; i++) {
        printf("%.1f ", y[i]);
    }

    printf("\n");

    
    for (int i = 0; i < N; i++) {
        free(A[i]);
    }
    free(A);
    free(x);
    free(y);

    return 0;
}

// Matheus Dias e Gabriel Gonzalez
//Uso de pthread
//Cada thread calcula uma linha x vetor
//Realização de matriz e vetor de tamanho escolhido pelo usuario, multiplicação e exibição do vetor final.
