#include <stdio.h>

int main()
{
float total;
float votos_brancos;
float votos_nulos;
float votos_validos;
float x;
float n1;
float n2;
float n3;

printf("Digite o numero de votos brancos:");
scanf("%f", &votos_brancos);

printf("Digite o numero de votos nulos:");
scanf("%f", &votos_nulos);

printf("Digite o numero de votos validos:");
scanf("%f",&votos_validos);

total= votos_brancos + votos_validos + votos_nulos;

printf("Digite um valor x para porcentagem:");
scanf("%f", &x);

n1= x/100*votos_brancos;
n2= x/100*votos_nulos;
n3= x/100*votos_validos;

printf("O valor em porcentagem de votos brancos eh: %f\n", n1);
printf("O valor em porcentagem de votos nulos eh: %f\n", n2);
printf("O valor em porcentagem de votos validos eh: %f\n", n3);

    return 0;
}


