#include <stdio.h>
int globalvar =10;
int main() {
    int localvar=20;
 
    printf("local variable in fun1 :%d \n", localvar);
    
     //globalvar=30;
    printf("global variable in fun1 :%d \n", globalvar);
    

    return 0;
}
