#include <stdio.h>
#include <math.h>

main()
//Fazer um algoritmo que leia o valor da aresta(a) de um cubo, calcule e escreva o seu volume e a área da superfície.
{
float a,v, area;

    printf("Digite um valor para a aresta:");
    scanf("%f",&a);
    //formula do volume
    v= pow(a,3);
    //formula da area
    area= 6*pow(a,2);
    printf("O valor do volume eh:%f \n", v);
    printf("O valor da area eh:%f", area);

}
