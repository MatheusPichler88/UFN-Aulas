#include <stdio.h>
#include <math.h>
main()
// Fazer um algoritmo que leia as dimensões dos lados de um triângulo (a,b,c), calculando e escrevendo a área
{
float a,b,c,s,area;

    printf("Digite o valor de a:");
    scanf("%f", &a);
    printf("Digite o valor de b:");
    scanf("%f", &b);
    printf("Digite o valor de c:");
    scanf("%f", &c);
     //formula do semi-perimetro
        s= (a+b+c)/2;
    //formula da area do triangulo
        area= sqrt(s*(s-a)*(s-b)*(s-c));
    printf("A area do triangulo eh:%f",area);
}
