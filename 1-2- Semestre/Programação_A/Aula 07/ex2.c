#include <stdio.h>
#include <math.h>
main()
{
    int b;
    int h;
    int area;
 //Fazer um algoritmo que leia as dimensões da base e da altura de um triângulo, calcule e escreva a sua área.

    printf("Digite o valor da base:");
    scanf("%d", &b);
    printf("Digite o valor da altura:");
    scanf("%d", &h);
    //formula da area de um trinagulo
        area= b*h/2;

    printf("O valor da area de um triangulo eh:%d", area);

}
