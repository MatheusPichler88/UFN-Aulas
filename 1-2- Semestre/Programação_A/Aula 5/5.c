#include <stdio.h>

int main() {
    int op, a, b, x;

    printf("Escolha uma operacao:\n(1)Soma\n(2)Subtracao\n(3)Multiplicacao\n(4)Divisao\n");
    scanf("%d", &op);
    printf("Digite o primeiro numero:\n");
    scanf("%d", &a);
    printf("Digite o segundo numero:\n");
    scanf("%d", &b);

    if (op == 1) {
        x = a + b;
        printf("O valor eh %d", x);
    } else if (op == 2) {
        x = a - b;
        printf("O valor eh %d", x);
    } else if (op == 3) {
        x = a * b;
        printf("O valor eh %d\n", x);
    } else if (op == 4) {
        if (b != 0) {
            x = a / b;
            printf("O valor eh %d\n", x);
        } else {
            printf("Nao eh possivel realizar uma divisao por zero.");
        }
    } else {
        printf("Operacao invalida.");
    }

    return 0;
}
