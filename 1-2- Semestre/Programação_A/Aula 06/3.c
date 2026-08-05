#include <stdio.h>
main () {
    char c;
    printf("Digite um caractere:");
    scanf("%c", &c);

    switch (c){
    case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            printf("eh uma vogal");
            break;

    default:
        printf("eh uma consoante");
    }








    }
