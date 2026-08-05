#include <cstdlib>
#include <ctime>

typedef struct no {
    int dado;
    struct no *prox;
} Celula;

Celula *inserir(int dado, Celula *lista){
    // Alocar memória
    Celula *novo = (Celula*)malloc(sizeof(Celula));

    // Depositar valores que vêm do parâmetro
    novo->dado = dado;
    novo->prox = NULL;

    // Testar se é o primeiro elemento a ser inserido
    if(!lista){  // Se lista for NULL
        return novo;
    }

    // Percorrer a estrutura até o final
    Celula *p;
    for(p = lista; p->prox != NULL; p = p->prox);

    // Encadear e retornar
    p->prox = novo;
    return lista;
}

void exibir(Celula *lista){
    for(Celula *p = lista; p != NULL; p = p->prox){
        cout << p->dado << "\t";
    }
    cout << endl;
}

int contarLista(Celula *lista){
    int total = 0;
    for(Celula *p = lista; p != NULL; p = p->prox){  
        total++;
    }
    return total;
}

bool estaNaLista(int dado, Celula *lista){
    for(Celula *p = lista; p != NULL; p = p->prox){
        if(dado == p->dado){
            return true;
        }
    }
    return false;  
}

//contar ocorrencias de um numero
int contarOcorrencias(int dado, Celula *lista) {
    int total = 0;
    for (Celula *p = lista; p != NULL; p = p->prox) {
        if (dado == p->dado) {
            total++;
        }
    }
    return total;
}

//verificar se a lista esta ou não ordenada
bool estaOrdenada(Celula *lista) {
    if (!lista->prox) {
        return true;
    }

    for (Celula *p = lista; p->prox != NULL; p = p->prox) {
        if (p->dado > p->prox->dado) {
            return false;
        }
    }
    return true;
}

//calcular a média do elementos da lista
int calcularMedia(Celula *lista) {
    int soma = 0;
    int total = 0;
    for (Celula *p = lista; p != NULL; p = p->
    prox) {
        soma += p->dado;
        total++;
    }
    return soma / total; 
}

//alterar o inserir para que controle duplicados - ou seja, proiba cadastro de replicados
