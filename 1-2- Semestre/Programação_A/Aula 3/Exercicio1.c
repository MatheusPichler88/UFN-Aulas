#include <stdio.h>

int main()
{
float pi= 3.14 ,numero_angulo, n, salario_inicial, salario_final, porcentagem;

//1) Escreva um programa em que o usuário informa um valor de um ângulo em graus, e então o programa mostra na tela o valor desse ângulo em radianos.

printf("Digite um valor para representar o angulo : ");
scanf("%f", &numero_angulo);

n = numero_angulo*pi/180;

printf("O valor eh: %f ", n  );
    return 0;
}

