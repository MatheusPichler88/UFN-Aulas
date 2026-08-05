#include <stdio.h>

int main() {
    int valor,n200,n100, n50, n20, n10, n5, n2, n1;

printf("Digite um valor:");
scanf("%d", &valor);

n200 = valor/200;
valor = valor - n200*200;

n100= valor/100;
valor= valor-n100*100;

n50 = valor/50;
valor = valor - n50*50;

n20 = valor/20;
valor = valor - n20*20;

n10 = valor/10;
valor = valor-n10*10;

n5 = valor/5;
valor = valor-n5*5;

n2 = valor/2;
valor = valor-n2*2;

n1 = valor/1;
valor = valor-n1*1;

printf("Nota de 200: %d \n",n200);
printf("Nota de 100: %d \n",n100);
printf("Nota de 50: %d \n",n50);
printf("Nota de 20: %d \n",n20);
printf("Nota de 10: %d \n",n10);
printf("Nota de 5: %d \n",n5);
printf("Nota de 2: %d \n",n2);
printf("Nota de 1: %d \n",n1);

    return 0;
}
