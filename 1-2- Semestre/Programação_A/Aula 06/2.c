#include <stdio.h>
main () {
    int n;
    printf("Digite um numero entre 1 a 7:");
    scanf("%d",&n);

    switch (n){
     	case 1:
     		printf("O dia de hoje eh Domingo.");
     		break;
     	case 2:
            printf("O dia de hoje eh Segunda-Feira.");
            break;
        case 3:
            printf("O dia de hoje eh Terca-Feira.");
            break;
        case 4:
            printf("O dia de hoje eh Quarta-Feira.");
            break;
        case 5:
            printf("O dia de hoje eh Quinta-Feira.");
            break;
        case 6:
            printf("O dia de hoje eh Sexta-Feira.");
            break;
        case 7:
            printf("O dia de hoje eh Sabado.");
            break;
        default:
            printf("O numero digitado eh invalido.");
    }
}
