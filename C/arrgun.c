#include<stdio.h>
int main(){
    int arr[3][3];
    printf("Enter the no:\n");
    for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
        scanf("%d",&arr[i][j]);
       }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         printf("\n value at %d * %d is: %d",i+1,j+1,arr[i][j]);
        }
     }

int res=1;
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         res=arr[i][j]*arr[j][i];
        }
     }

printf("\n%d",res);
    }