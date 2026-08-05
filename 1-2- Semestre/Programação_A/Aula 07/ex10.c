#include <stdio.h>
#include <math.h>
main()
//Fazer um algoritmo que converta uma temperatura qualquer de graus fahrenheit para celsius. A fórmula abaixo pode ser aplicada diretamente ou há necessidade de isolar TC ?

{
float c, f;
    printf("Digite um valor para fahrenheit:");
    scanf("%f", &f);
    //Formula de Fahrenheit/Celsius
        c = (f-32)/1.8;
    printf("O valor de %f fahrenheit para celsius eh de:%f ",f,c);


}
