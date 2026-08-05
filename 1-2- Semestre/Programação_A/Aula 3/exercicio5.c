#include <stdio.h>

int main() {
    float odometro_inicio, odometro_final, litros, valor_total, distancia_percorrida,consumo_km_por_litro,  lucro_liquido;
    float preco_combustivel = 0.90;

    printf("Digite o valor do odometro no inicio do dia (Km): ");
    scanf("%f", &odometro_inicio);

    printf("Digite o valor do odometro no final do dia (Km): ");
    scanf("%f", &odometro_final);

    printf("Digite o numero de litros de combustivel gasto: ");
    scanf("%f", &litros);

    printf("Digite o valor total recebido dos passageiros (R$): ");
    scanf("%f", &valor_total);

    distancia_percorrida = odometro_final - odometro_inicio;
    consumo_km_por_litro = distancia_percorrida / litros;
    lucro_liquido = valor_total - (litros * preco_combustivel);

    printf("Media de consumo: %f Km \n", consumo_km_por_litro);
    printf("Lucro liquido do dia: R$%f \n", lucro_liquido);

    return 0;
}
