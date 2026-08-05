#include <stdio.h>
#include <math.h>


main ()
{
float vel_inicial,angulo, distancia, sen, x;
float gravidade = 9.81;
float pi = 3.14;

printf("O valor para velocidade inicial:");
scanf("%f",&vel_inicial);

printf("O valor do angulo:");
scanf("%f",&angulo);
x = angulo * pi / 180;
sen = sin(2 * x);
distancia = (pow(vel_inicial, 2) * sen)/gravidade;

printf("A distancia percorrida eh: %f", distancia);

}
