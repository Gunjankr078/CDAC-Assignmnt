#include<stdio.h>
void main(){
      int a,b;
   printf("enter first Number :");
   scanf("%d",&a);
   printf("enter second Number :");
    scanf("%d",&b);
   a=a+b;
   b=a-b;
   a=a-b;
    

    printf("\nAfter Swapping first Number is %d :",a);
    printf("After Swapping second Number is %d :",b);


}