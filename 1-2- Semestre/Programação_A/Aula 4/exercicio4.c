#include <stdio.h>
#include <math.h>
int main() {
float valor_inicial, montante;
int  juros,meses;

printf("Digite o capital:R$");
scanf("%f", &valor_inicial);

printf("Digite o valor do juros:");
scanf("%d", &juros);

printf("Em quantos meses?" );
scanf("%d" , &meses);

montante = valor_inicial * pow(1 + juros/100, meses);

printf("O valor de R$%.2f foi aumentado em %.1d por cento em um periodo de %.1d meses para R$%.2f reais", valor_inicial, juros, meses, montante);
    return 0;
}
