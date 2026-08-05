#include <stdio.h>
#include <conio.h>

int main() {
    int num, total = 0;
    int i = 0;
    float media;

    do {
        printf("Digite um numero positivo (ou 0 para encerrar): ");
        scanf("%d", &num);

        if (num > 0) {
            total = total + num;
            i++;
        } else if (num < 0) {
            printf("Numero negativo eh invalido.\n");
        }
    } while (num != 0);

    if (i > 0) {
        media = total / i;
        printf("A media dos numeros digitados eh: %.2f\n", media);
    } else {
        printf("Nenhum numero positivo foi digitado.\n");
    }

    return 0;
}
