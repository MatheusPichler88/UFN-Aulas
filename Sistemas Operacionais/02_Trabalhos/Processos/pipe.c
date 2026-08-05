#include <stdlib.h>
#include <unistd.h>
#include <sched.h>

int main (){
    int fd[2];
    if (pipe(fd) == -1) {
        perror("pipe");
        exit(EXIT_FAILURE);
    }
    pid_t pid = fork();
    if (pid < 0) {
        perror("fork");
        exit(EXIT_FAILURE);
    }
    if ( pid == 0) {
        close(fd[0]);
        char message[] = "Olá pai!";
    }