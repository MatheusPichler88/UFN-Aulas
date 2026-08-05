#include <iostream>
using namespace std;

#include "lista.h"

int main() {
    Celula *lista = NULL;

    lista = inserir(7, lista);
    lista = inserir(10, lista);
    lista = inserir(5, lista);
    lista = inserir(8, lista);
    lista = inserir(65, lista);
    lista = inserir(15, lista);
    lista = inserir(7, lista);
    lista = inserir(10, lista);
    lista = inserir(3, lista);
    lista = inserir(10, lista);

    cout << "Lista contem " << contarLista(lista) << " elementos\n";
    exibir(lista);

    int numero;
    cout << "Digite um numero para pesquisar: ";
    cin >> numero;

    cout << numero << " esta na lista? " << (estaNaLista(numero, lista) ? "Sim" : "Não") << endl;

    cout << "Contando ocorrencias de " << numero << endl;
    int ocorrencias = contarOcorrencias(numero, lista);
    cout << "O numero " << numero << " apareceu " << ocorrencias << " vezes" << endl;

    if (estaOrdenada(lista)) {
        cout << "A lista esta ordenada" << endl;
    } else {
        cout << "A lista nao esta ordenada" << endl;
    }
    int media = calcularMedia(lista);
    cout << "A media dos elementos da lista eh: " << media << endl;
    return 0;
}
