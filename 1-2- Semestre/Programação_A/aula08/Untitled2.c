#include <stdio.h>
#include <conio.h>
int main(){
    int i;
    int j;
    int matriz_original[2][3];
    for(i=0; i<2; i++){
        for(j=0; j<3; j++){
            printf("digite o elemento [%d][%d]:",i, j);
            scanf("%d", &matriz_original[i][j]);
        }
    }
    //mostrando a matriz original
    printf("a matriz original eh: \n");
    for(i=0; i<2; i++){
        for(j=0; j<3; j++){
            printf("%d ", matriz_original[i][j]);
        }
        printf("\n");
    }
    //matriz transposta j,i
    printf(" \n");
    for(j=0; j<3; j++){
        for(i=0; i<2; i++){
      printf("%d ", matriz_original[i][j]);
        }
        printf("\n");
    }
}
