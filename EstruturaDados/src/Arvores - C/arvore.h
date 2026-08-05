typedef struct no {
    int dado;
    struct no *esq;
    struct no *dir;
} Arvore;
 
Arvore *inserir(int valor, Arvore *raiz) {
    if (raiz) { //percurso pré-fixado ou RED
        //percorrer ou pra esquerda ou pra direita
        if (valor < raiz->dado) {
            //ir para esquerda
            raiz->esq = inserir(valor, raiz->esq);
        } else {
            //ir para direita
            raiz->dir = inserir(valor, raiz->dir);
        }
        return raiz;
    } else {
        Arvore *novo = (Arvore*)malloc(sizeof(Arvore));
        novo->dado = valor;
        novo->esq = NULL;
        novo->dir = NULL;
        return novo;
    }
}
 
void exibirOrdenado(Arvore *raiz) {
    if (raiz) { //percurso in-fixado ou ERD
        exibirOrdenado(raiz->esq);
        cout << raiz->dado << "\t";
        exibirOrdenado(raiz->dir);
    }
}
 
int contar(Arvore *raiz) {
    if (raiz) {
        return 1 + contar(raiz->esq) + contar(raiz->dir);        
    }
    return 0;
}
 
int somar(Arvore *raiz) {
    if (raiz) {
        return raiz->dado + somar(raiz->esq) + somar(raiz->dir);        
    }
    return 0;
}
 
int contarPares(Arvore *raiz) {
    if (raiz) {
        if (raiz->dado % 2 == 0) {
            return 1 + contarPares(raiz->esq) + contarPares(raiz->dir);        
        }
        return 0 + contarPares(raiz->esq) + contarPares(raiz->dir);        
    }
    return 0;
}

void exibirFolhas(Arvore*raiz){
    if(raiz){
        if (!raiz -> esq && !raiz ->dir){
            cout 
        }
        return 0;
}
}

int contarFolhas(Arvore*raiz){
    if(raiz){
        if (!raiz -> esq && !raiz ->dir){
            return 1;
        }
        return contarFolhas(raiz ->) + contarFolhas(raiz ->dir);
    }
}

bool localizar(int valor, Arvore*raiz){
    if(raiz){
        if(valor == raiz ->dado){
        return true;
    }
    if(valor <raiz ->dado){//percorrer para esquerda
        return localizar(valor, raiz ->esq);
    } else{ //percorrer para direita
            return localizar (valor,raiz ->dir)
    }
    return false;
}

