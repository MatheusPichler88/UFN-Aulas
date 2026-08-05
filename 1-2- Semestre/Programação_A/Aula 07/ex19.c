#include <stdio.h>

int main() {
    int dia_nasc, mes_nasc, ano_nasc,dia_atual, mes_atual, ano_atual,dias_vividos;


    printf("Digite a data de nascimento completa: ");
    scanf("%d %d %d", &dia_nasc, &mes_nasc, &ano_nasc);

    printf("Digite a data atual ");
    scanf("%d %d %d", &dia_atual, &mes_atual, &ano_atual);

    dias_vividos = (ano_atual - ano_nasc) * 365 + (mes_atual - mes_nasc) * 30 + (dia_atual - dia_nasc);
    printf("Voce viveu cerca de  %d dias. \n", dias_vividos);

}
