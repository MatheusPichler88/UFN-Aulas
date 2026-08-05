#include <stdio.h>
#include <math.h>
main (){
    int a,b,c;

    printf("Digite um valor:");
    scanf("%d", &a);
    printf("Digite outro valor: ");
    scanf("%d", &b);

    if (a%b ==0){
        printf("O valor de %d eh multiplo de %d",a,b);
    }
    else
        printf("O valor de %d nao eh multiplo de %d",a,b);

}
