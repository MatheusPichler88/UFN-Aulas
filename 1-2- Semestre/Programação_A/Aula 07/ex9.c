#include <stdio.h>
#include <math.h>
main()
//Fazer um algoritmo que leia uma temperatura em graus celsius e escreva as temperaturas correspondentes em graus fahrenheit, kelvin e rankine.
{
float c, f, k, r;
    printf("Digite um valor para graus celsius:");
    scanf("%f", &c);

    f = (c*1.8)+32;
    k = c+273;
    r = c*1.8 + 491.67;
    printf("O valor em faren %f \n", f);
    printf("O valor em kelvin %f \n", k);
    printf("O valor em rankine %f \n", r);


}
