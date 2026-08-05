#include <stdio.h>
#include <pthread.h>

int cont = 5;
pthread_mutex_t lock;

void* processoA(void* arg) {
    pthread_mutex_lock(&lock);
    cont = cont + 1;
    pthread_mutex_unlock(&lock);
    return NULL;
}

void* processoB(void* arg) {
    pthread_mutex_lock(&lock);
    cont = cont - 1;
    pthread_mutex_unlock(&lock);
    return NULL;
}

int main() {
    pthread_t t1, t2;

    pthread_mutex_init(&lock, NULL);

    pthread_create(&t1, NULL, processoA, NULL);
    pthread_create(&t2, NULL, processoB, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    printf("Valor final : %d\n", cont);

    pthread_mutex_destroy(&lock);

    return 0;
}