#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//Variavel global
int bits[8];
//Verifica se algum bit foi 9
int VerificacaoBits(int *bits) {
    for (int i = 0; i < 8; i++) {
        if (bits[i] == 9) {
            return 1; //Retorna 1 se for falha
        }
    }
    return 0; //Retorna 0 se os bits foram lidos corretamentes
}

int main() {
    for (int i = 0; i < 8; i++) {
        scanf("%d", &bits[i]);
        //Verifica se os valores lidos são 1,0,9
        if (bits[i] != 0 && bits[i] != 1 && bits[i] != 9) {
            printf("Valor invalido!\n");
            return 1; //Se não for, retorna 1 como falha
        }
    }
    //Chama a função, dependendo do retorno ele exibe a mensagem de F para falha e S para Sucesso.
    if (VerificacaoBits(bits)) {
        printf("F\n");
    } else {
        printf("S\n");
    }
    return 0;
}
