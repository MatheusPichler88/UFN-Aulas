#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    float largura, comprimento;

    printf("Digite a largura do terreno: ");
    scanf("%f", &largura);
    printf("Digite o comprimento do terreno: ");
    scanf("%f", &comprimento);

    pid_t pid = fork();

    if (pid < 0) {
        fprintf(stderr, "Falha ao criar o processo filho.\n");
        return 1;
    } 
    else if (pid == 0) {

        float area = largura * comprimento;
        printf("\n[Filho] Calculando a área...");
        printf("\n[Filho] Resultado da Área: %.2f m²\n", area);
    } 
    else {

        float perimetro = 2 * (largura + comprimento);
        
        
        wait(NULL); 
        
        printf("\n[Pai] Calculando o perímetro...");
        printf("\n[Pai] Resultado do Perímetro: %.2f m\n", perimetro);
    }

    return 0;
}
