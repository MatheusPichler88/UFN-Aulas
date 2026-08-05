#include <stdio.h>
#include <math.h>
int main() {
float graus, fahrenheit;

printf("Digite um valor em graus Celsius:");
scanf("%f",&graus);

fahrenheit = (graus * 9/5) + 32;

printf("O valor %.1f C eh de %.1f F", graus,fahrenheit);

    return 0;
}
