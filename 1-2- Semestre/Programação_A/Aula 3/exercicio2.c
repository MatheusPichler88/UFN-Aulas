#include <stdio.h>

int main()
{
float salario1;
float salario_final;
float x;

//2) Faça um algoritmo que leia o salário inicial de um funcionário e a porcentagem de aumento, e então mostre na tela o valor do salário final com o ajuste aplicado.

printf("Digite um valor para o salario:");
scanf("%f", &salario1);

printf("Digite o valor para porcentagem");
scanf("%f", &x);

salario_final= salario1 + (salario1*x/100);

printf("O seu salario eh: %f", salario_final  );
    return 0;
}


