#include<stdio.h>
int main(){
   int arr[5];
   int res=0;
   
    printf("Enter your Marks in 5 subjects : \n");
    for(int i=0;i<=4;i++){
    scanf("%d",&arr[i]);
    }
    for(int i=0;i<=4;i++){
       res+=arr[i];

        }

    printf("\nYour total Score is : %d",res);

    float per = (res*100)/500;
    printf("\nYour Percentage is : %2f",per);

if(per>=70){
    printf("\nYOur Grade Is A");
}
else if (per>=45 && per <=69){
    printf("\nYOur Grade Is B");
}
else
   printf("\nYOur are Fail");

}