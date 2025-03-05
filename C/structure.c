#include <stdio.h>


struct Person {
    char name[50];
    int age;
    float height;
};

int main(){
    struct Person person1;
    

    printf("Enter Name :");
    scanf("%s", person1.name);
    printf("Enter Age:");
    scanf("%d",&person1.age);
    printf("Enter Height :");
    scanf("%f",&person1.height);

    printf("\nName   : %s ", person1.name);
    printf("\nAge    :%d ", person1.age);
    printf("\nHeight :%f", person1.height);
    
    struct Person person2;
    
    printf("Enter Name :");
    scanf("%s", person2.name);
    printf("Enter Age:");
    scanf("%d",&person2.age);
    printf("Enter Height :");
    scanf("%f",&person2.height);

    printf("\nName   : %s ", person2.name);
    printf("\nAge    :%d ", person2.age);
    printf("\nHeight :%f", person2.height);


    return 0;


    
}


