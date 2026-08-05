#include <stdio.h>
#include <math.h>
main()
/*Fazer um algoritmo que leia o valor de dois lados de um triângulo e o ângulo entre estes lados em graus(a,b,α), calcule e escreva a área deste triângulo. */
{
float l1,l2,area,x, alpha;
float pi=M_PI;


    printf("Digite um valor para l1:");
    scanf("%f", &l1);
    printf("Digite um valor para l2:");
    scanf("%f", &l2);
    printf("Digite um valor para alpha:");
    scanf("%f", &alpha);

    //formula de graus para radianos
        x = alpha * pi / 180;
    //formula da area
        area = l1*l2*sin(x)/2;

    printf("O valor da area do triangulo eh: %f",area);
}
