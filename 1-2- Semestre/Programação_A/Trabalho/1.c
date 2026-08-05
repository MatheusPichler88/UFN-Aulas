#include <stdio.h>
int main(){
    int senha = 3518;
    int x;
    printf("Digite a senha (4 digitos):");
    scanf("%d", &x);
    while(x!=senha){
        printf("\n A senha esta incoreta. \n Tente novamente:");
        scanf("%d", &x);
    }
    printf("\n A senha esta correta");
}
