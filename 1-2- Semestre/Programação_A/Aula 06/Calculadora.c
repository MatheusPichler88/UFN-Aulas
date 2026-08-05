#include <stdio.h>
#include <math.h>
main ()
{
     float  x, a,b;
     int num;
     printf("Digite um numero para: \n (1) Soma \n (2) Subtracao \n (3) Multiplicacao \n (4) Divisao \n ");
     scanf("%d", &num);
     printf("Digite o primeiro numero:");
     scanf("%f", &a);
     printf("Digite o segundo numero:");
     scanf("%f", &b);

     switch (num){
     	case 1:
     	    x = a+b;
     		printf("A soma do primeiro numero com o segundo eh:%f", x);
     		break;
     	case 2:
     	    x= a-b;
		 	printf("A subtracao do primeiro numero com o segundo eh:%f", x);
			 break;
		case 3:
		    x = a*b;
			printf("A multiplicacao do primeiro numero com o segundo eh:%f", x);
			 break;
     	case 4:
     	    x = a/b;
        if (b==0) {
            printf("Nao eh possivel dividir por 0 \n");
     	}
     	else if (b<0)
            printf("Nao eh possivel dividir por um numero negativo \n");
     	else
     		printf("A divisao do primeiro numero com o segundo eh:%f", x);

			 break;

		default:
		    printf("O numero digitado eh invalido");
     }
}
