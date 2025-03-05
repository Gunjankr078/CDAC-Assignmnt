#include<stdio.h>

int main() {
    int a,b,add,sub,mul,div,choice;
    
   printf("enter first Number :");
   scanf("%d",&a);
   printf("\nenter Second Number :");
    scanf("%d",&b);
   printf("\nenter 1 for Addition");
   printf("\nenter 2 for Subtraction"); 
   printf("\nenter 3 for Multiplication"); 
   printf("\nenter 4 for Division\n");
    scanf("%d",&choice);
    if(choice==1){
        add = a+b;
        printf("\nsum is %d ", add);
    }
    else if(choice==2){
        sub = a-b;
        printf("\nsub is %d ", sub);
    }
    else if(choice==3){
        mul = a*b;
        printf("\nMul is %d ", mul);
    }
    else if(choice==4){
        div = a/b;
        printf("\ndiv is %d ", div);
    }
    else
    printf("invalid Choice");
    

    return 0;
}