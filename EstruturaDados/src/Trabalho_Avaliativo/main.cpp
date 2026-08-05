#include "lista.h"

int main(){
    srand(time(NULL));

    Celula *lista1 = preencherAleatorio(25);
    Celula *lista2 = preencherAleatorio(30);

     cout << "Exibindo a lista 1:\n";
    exibir(lista1);
    cout << "Exibindo a lista 2:\n";
    exibir(lista2);

    exibirComuns(lista1, lista2);

    cout << "\nExcluindo os pares da primeira lista\n";
    lista1 = excluirPares(lista1);
    exibir(lista1);

    cout << "\nUnindo as listas\n";
    Celula *unida = unirListas(lista1, lista2);
    exibir(unida);

    cout << "\nOrdenando a lista\n";
    ordenar(unida);
    exibir(unida);

    return 0;
}
