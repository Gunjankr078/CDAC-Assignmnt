#include<stdio.h>
int main(){
    int a =10;
    int v=50,e=80;
    a++;
    printf("\nvalue is : %d",a);
    a+=5;
    printf("\nvalue is : %d",a);
    a-=8;
    printf("\nvalue is : %d",a);
    a*=8;
    printf("\nvalue is : %d",a);
    a%=5;
    printf("\nvalue is : %d",a);
    int *p=&v;
    printf("\nvalue is : %d",p);
    printf("\nvalue is : %d",*p);
     //   printf("\n-----------------------");
    // int *x=&e;
  // printf("\nvalue is : %d",x);
   // printf("\nvalue is : %d",*x);
    int t=10,u=100,res;
    res=t&u;
    printf("\nbitwise and operator : %d",res);
    res=t|u;
    printf("\nbitwise and operator : %d",res);



}