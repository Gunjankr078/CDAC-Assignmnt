#include<stdio.h>

int takeinput(){
    int num;
    printf("Enter a num :");
    scanf("%d",&num);
    return num;
}

int add(int a,int b){
int sum = a+b;
return sum;
}

int sub(int a,int b){
    int sub = a-b;
    return sub;
}
int mul(int a, int b){
    int mul = a*b;
    return mul;
}
float div(float a, float b){
    float div = a/b;
    return div;
}


 void showoutput(float x){
    printf("\nresult is : %2f",x);
    
 }

int main(){
int num1 = takeinput();
int num2 = takeinput();
int res;

res=add(num1,num2);
showoutput(res);

int sub1= sub(num1,num2);
showoutput(sub1);

int mul1 = mul(num1,num2);
showoutput(mul1);

float div1= div(num1, num2);
showoutput(div1);

}