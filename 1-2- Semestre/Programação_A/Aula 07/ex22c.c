#include <stdio.h>

main (){
int alunos, grupos, x1,x2;

printf("Digite a quantidade de alunos na sala:");
scanf("%d", &alunos);

printf("Digite a quantidade de grupos na sala:");
scanf("%d", &grupos);

x1= alunos/grupos;
x2= alunos%grupos;

printf("A quantidade de grupos formados eh %d e sobraram %d alunos que nao formaram um grupo",x1, x2);
}
