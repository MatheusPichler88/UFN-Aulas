#include <stdio.h>

int main() {
    int x, y;

    printf("Digite o valor de x:");
    scanf("%d", &x);
    printf("Digite o valor de y: ");
    scanf("%d", &y);

    if (x == 0 && y == 0) {
        printf("O ponto esta na origem \n");
    }
    else if (x == 0) {
        printf("O ponto esta sobre o eixo y \n");
    }
    else if (y == 0) {
        printf("O ponto esta sobre o eixo x \n");
    }
    else if (x > 0 && y > 0) {
        printf("O ponto esta no primeiro quadrante\n");
    }
    else if (x < 0 && y > 0) {
        printf("O ponto esta no segundo quadrante\n");
    }
    else if (x < 0 && y < 0) {
        printf("O ponto esta no terceiro quadrante\n");
    }
    else if (x > 0 && y < 0) {
        printf("O ponto esta no quarto quadrante\n");
    }

}
