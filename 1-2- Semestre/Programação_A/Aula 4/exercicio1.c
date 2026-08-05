#include <stdio.h>
#include <math.h>
int main() {
float x1, x2, x3, raiz;

printf("Digite o primeiro valor:");
scanf("%f",&x1);

printf("Digite o segundo valor:");
scanf("%f",&x2);

printf("Digite o terceiro valor:");
scanf("%f",&x3);

raiz = cbrt(x1*x2*x3);
printf("Raiz: %f", raiz);


    return 0;
}
