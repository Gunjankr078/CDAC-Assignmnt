#include<stdio.h>
int main(){
    int arr[3][3];
    for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
            printf("Enter %d row %d Column Number :",row+1,col+1);
            scanf("%d",&arr[row][col]);
        }
    }

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            printf("\nValue at %d * %d is : %d",i+1,j+1,arr[i][j]);
        }
    }
}