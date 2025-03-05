#include<stdio.h>

int main() {
    int a,b,sum;
    
   printf("enter first Number :");
   scanf("%d",&a);
   printf("\nenter Second Number :");
    scanf("%d",&b);
     if(a<b)
     printf("first number is smaller : %d", a);
     else if(a>b)
     printf("Secomd number is smaller %d" ,b);
     else 
     printf("both are equal");
    

    return 0;
}