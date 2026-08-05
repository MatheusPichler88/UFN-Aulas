#include <stdio.h>
#include <math.h>

main() {
    float x1, y1, x2, y2, distancia;

    printf("Digite o valor do primeiro ponto (x, y): ");
    scanf("%f %f", &x1, &y1);

    printf("Digite o valor do segundo ponto (x, y): ");
    scanf("%f %f", &x2, &y2);

    distancia = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

    printf("A distancia entre os pontos eh: %f\n", distancia);


}
