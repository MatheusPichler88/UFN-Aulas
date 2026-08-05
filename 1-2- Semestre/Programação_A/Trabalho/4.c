#include <stdio.h>
#include <conio.h>
int main(){
    int limite;
    int soma = 0;
    int numero = 0;
    printf("Digite um limite:");
    scanf("%d", &limite);
    while(numero<=limite){
        soma += numero;
        numero++;
        printf(" \nA soma de 0 a %d: %d", limite,  soma);

    }




}
