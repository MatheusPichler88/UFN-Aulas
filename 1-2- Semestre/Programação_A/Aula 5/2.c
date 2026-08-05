#include <stdio.h>
#include <math.h>
main (){
    int a,b,c;

    printf("Digite um numero:");
    scanf("%d", &a);
    printf("Digite o segundo numero:");
    scanf("%d", &b);
    printf("Digite o terceiro numero:");
    scanf("%d", &c);

    if (a >= b && a >= c){
        printf("O maior valor eh: %d", a);
    }
    else if (b >= a && b>= c)
        printf("O maior valor eh: %d",b);

    else
        printf("O maior valor eh: %d",c);


}
