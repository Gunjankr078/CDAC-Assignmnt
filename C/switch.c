#include<stdio.h>
int main(){
    int day;
    printf("Enter the day in no:\n");
    scanf("%d",&day);
    switch (day)
    {
    case 1:
        printf("first day is monday");
        break;
    case 2:
        printf("2 day is tue");
    case 3:
        printf("3 day is wed");
        
    case 4:
        printf("4 day is thr");
    default:
        printf("other day\n");
        break;
    }
    return 0;
}