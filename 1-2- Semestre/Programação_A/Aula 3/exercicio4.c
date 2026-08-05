#include <stdio.h>

int main()
{
float c;
float l;
float a;
float area_total;
float quantidade_caixas;


//4) Escrever um algoritmo para ler as dimensões de uma cozinha (comprimento, largura e altura), calcular e escrever a quantidade de caixas de azulejos para azulejar todas as paredes (considere que não será descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1,5 metros quadrados.

printf("Digite um valor para o comprimento:");
scanf("%f", &c);

printf("Digite um valor para a largura:");
scanf("%f", &l);

printf("Digite um valor para altura:");
scanf("%f", &a);

area_total = 2 * a * (c + l);
quantidade_caixas = area_total / 1.5;
printf("A quantidade de caixas de azulejos necessaria eh: %f caixas\n", quantidade_caixas);


    return 0;
}
