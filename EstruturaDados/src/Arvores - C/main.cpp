#include <iostream>
#include <cstdlib>
 
using namespace std;
 
#include "arvore.h"
 
int main() {
    Arvore *arvore = NULL;
    arvore = inserir(50, arvore);
    arvore = inserir(35, arvore);
    arvore = inserir(40, arvore);
    arvore = inserir(60, arvore);
 
    cout << "Total de elementos: " << contar(arvore) << endl;
    exibirOrdenado(arvore);
 
    return 1;

}

