#include <stdio.h>
main () {
    int n;
    printf("Digite um numero de 1 a 12, que represente um mes:");
    scanf("%d", &n);

    switch(n){
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        printf("Esse mes tem 31 dias.");
        break;
    case 2:
        printf("Esse mes tem 28 ou 29 dias (ano nao bissexto)");
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        printf("Esse mes tem 30 dias.");
        break;

    default:
        printf("Numero invalido");
    }
}

