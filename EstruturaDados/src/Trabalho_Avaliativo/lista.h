#define LISTA_H

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

typedef struct no {
    int dado;
    struct no *prox;
} Celula;

// Declarando o protótipo das funções
Celula *inserir(int dado, Celula *lista);
void exibir(Celula *lista);
Celula *preencherAleatorio(int n);
void exibirComuns(Celula *lista1, Celula *lista2);
Celula *excluirPares(Celula *lista);
Celula *unirListas(Celula *lista1, Celula *lista2);
void ordenar(Celula *lista);
Celula *liberar(Celula *lista);



Celula *inserir(int dado, Celula *lista){
    Celula *novo = (Celula*)malloc(sizeof(Celula));
    novo->dado = dado;
    novo->prox = NULL;

    if(!lista){
        return novo;
    }

    Celula *p;
    for(p = lista; p->prox != NULL; p = p->prox);
    p->prox = novo;
    return lista;
}

void exibir(Celula *lista){
    for(Celula *p = lista; p != NULL; p = p->prox){
        cout << p->dado << "\t";
    }
    cout << endl;
}

Celula *preencherAleatorio(int n){
    Celula *lista = NULL;
    for(int i = 0; i < n; i++){
        int valor = rand() % 100 + 1;
        lista = inserir(valor, lista);
    }
    return lista;
}

void exibirComuns(Celula *lista1, Celula *lista2){
    cout << "Elementos comuns:\n";
    for(Celula *p = lista1; p != NULL; p = p->prox){
        for(Celula *q = lista2; q != NULL; q = q->prox){
            if(p->dado == q->dado){
                cout << p->dado << "\t";
                break;
            }
        }
    }
    cout << endl;
}

Celula *excluirPares(Celula *lista){
    Celula *anterior = NULL;
    Celula *p = lista;

    while(p != NULL){
        if(p->dado % 2 == 0){
            Celula *temp = p;
            if(anterior == NULL){
                lista = p->prox;
                p = lista;
            } else {
                anterior->prox = p->prox;
                p = p->prox;
            }
            free(temp);
        } else {
            anterior = p;
            p = p->prox;
        }
    }
    return lista;
}

Celula *unirListas(Celula *lista1, Celula *lista2){
    if(!lista1) return lista2;
    Celula *p;
    for(p = lista1; p->prox != NULL; p = p->prox);
    p->prox = lista2;
    return lista1;
}

void ordenar(Celula *lista){
    for(Celula *p = lista; p != NULL; p = p->prox){
        for(Celula *q = p->prox; q != NULL; q = q->prox){
            if(p->dado > q->dado){
                int aux = p->dado;
                p->dado = q->dado;
                q->dado = aux;
            }
        }
    }
}


