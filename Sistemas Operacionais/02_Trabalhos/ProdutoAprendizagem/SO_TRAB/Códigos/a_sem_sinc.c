#include <stdio.h>
#include <pthread.h>

int cont = 5;

void* processoA(void* arg) {
    cont = cont + 1;
    return NULL;
}

void* processoB(void* arg) {
    cont = cont - 1;
    return NULL;
}

int main() {
    pthread_t t1, t2;

    pthread_create(&t1, NULL, processoA, NULL);
    pthread_create(&t2, NULL, processoB, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    printf("Valor final (sem sincronização): %d\n", cont);

    return 0;
}