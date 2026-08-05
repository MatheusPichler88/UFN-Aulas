#include <stdio.h>

main (){
float hora1, minuto1, segundo1, hora2, minuto2, segundo2, x1, x2, x3;
printf("Digite um horario completo:");
scanf("%f %f %f", &hora1, &minuto1, &segundo1);

printf("Digite um segundo horario:");
scanf ("%f %f %f", &hora2, &minuto2, &segundo2);

x1= (hora1*60*60) + (minuto1*60) + (segundo1);
x2= (hora2*60*60) + (minuto2*60) + (segundo2);
x3= x2-x1;

printf("A diferenca de segundos entre o primeiro horario para o segundo eh de:%f segundos", x3);





}
