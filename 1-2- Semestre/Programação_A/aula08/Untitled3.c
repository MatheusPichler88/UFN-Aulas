#include <stdio.h>
#include <conio.h>
int main(){
    int matriz_resultado[4][4];
    int matrizA[4][4];
    printf("digite os elementos da matriz A: ");
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            printf("\n elementos [%d][%d]: ", i, j);
            scanf("%d", &matrizA[i][j]);
        }
    }
    int matrizB[4][4];
    printf("digite os elementos da matriz B:");
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            printf("\n elementos matrizB [%d][%d]:", i,j);
            scanf("%d", &matrizB[i][j]);
        }
    }
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            matriz_resultado[i][j] = 0;
        }
    }
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            for(int k=0; k<4; k++){
                matriz_resultado[i][j] = matrizA[i][k] * matrizB[k][j];
            }
        }
    }
    int menor_elemento = matriz_resultado[0][0];
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            if(matriz_resultado[i][j] < menor_elemento){
                menor_elemento = matriz_resultado[i][j];
            }
        }
    }
    printf("\n matriz A:");
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++)
        printf("%d", matrizA[i][j]);
    } printf("\n");
    printf("\n matriz B:");
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            printf("%d", matrizB[i][j]);
        } printf("\n");
        printf("\n matriz resultado:");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                printf("%d", matriz_resultado[i][j]);
            }printf("\n")
;            printf("\n menor elemento da matriz resultado eh: %d", menor_elemento);
        }
    }
}
