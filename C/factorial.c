#include<stdio.h>
void fact(int x){
    if(x==0){
    return 1;}

    else{
        return x*fact(x-1);
    }
}
int main(){
    int num;
    printf("Enter a num :");
    scanf("%d",&num);
    int res = fact(num);
    printf("%d",res);
    return 0;
}
