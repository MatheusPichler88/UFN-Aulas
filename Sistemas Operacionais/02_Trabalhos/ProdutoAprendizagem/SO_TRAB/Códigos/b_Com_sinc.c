#include <stdio.h>
#include <pthread.h>

int saldo = 100;
pthread_mutex_t lock;

void* saque(void* arg) {
    int valor = 10;

    pthread_mutex_lock(&lock);
    saldo = saldo - valor;
    pthread_mutex_unlock(&lock);

    return NULL;
}

int main() {
    pthread_t t1, t2;

    pthread_mutex_init(&lock, NULL);

    pthread_create(&t1, NULL, saque, NULL);
    pthread_create(&t2, NULL, saque, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    printf("Saldo final: %d\n", saldo);

    pthread_mutex_destroy(&lock);

    return 0;
}