#include <stdio.h>
#include <math.h>
main()
{
//Fazer um algoritmo que leia as dimensões dos lados de um retângulo, calcule e escreva a sua área.
    int b,h,area;

    printf("Digite o valor para a base:");
    scanf("%d", &b);
    printf("Digite o valor da altura:");
    scanf("%d", &h);
    //formula da area de um retangulo
        area= b*h;
    printf("O valor da area eh:%d", area);


}
