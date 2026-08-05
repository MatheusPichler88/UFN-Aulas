#include <stdio.h>
#include <math.h>

main()
//Fazer um algoritmo que leia três notas de um aluno, calcule e escreva a sua média aritmética conforme equação
{
float n1,n2,n3,m;

    printf("Diga o valor da primeira nota:");
    scanf("%f",&n1);
    printf("Diga o valor da segunda nota:");
    scanf("%f",&n2);
    printf("Diga o valor da terceira nota:");
    scanf("%f",&n3);

    m = (n1+n2+n3)/3;
    printf("A media eh:%f", m);

}
