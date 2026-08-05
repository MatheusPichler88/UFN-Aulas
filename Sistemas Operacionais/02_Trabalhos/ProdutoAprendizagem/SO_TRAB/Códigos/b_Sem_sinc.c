#include <stdio.h>
#include <pthread.h>

int saldo = 100;

void* saque(void* arg) {
    int valor = 10;
    saldo = saldo - valor;
    return NULL;
}

int main() {
    pthread_t t1, t2;

    pthread_create(&t1, NULL, saque, NULL);
    pthread_create(&t2, NULL, saque, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    printf("Saldo final (sem sincronização): %d\n", saldo);

    return 0;
}