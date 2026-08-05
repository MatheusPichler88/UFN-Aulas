#include <stdio.h>
#include <conio.h>
int main(){
    int matriz[3][3];
    printf("digite os elementos da matriz: ");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            printf("elementos [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }
    int maior_elemento = matriz[0][0];
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(matriz[i][j] > maior_elemento){
                maior_elemento = matriz[i][j];
            }
        }
    }
    printf("o maior elemento eh: \n %d", maior_elemento);
