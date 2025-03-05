#include <stdio.h>


struct Person {
    char name[50];
    int age;
    float height;
};
 void takeInput(struct Person *p){
    
    printf("Enter Name :");
    scanf("%s", p->name);
    printf("Enter Age:");
    scanf("%d",&p->age);
    printf("Enter Height :");
    scanf("%f",&p->height);

 }

 void showStruct(struct Person p){
    
    printf("\nName   : %s ", p.name);
    printf("\nAge    :%d ", p.age);
    printf("\nHeight :%f", p.height);

 }
int main(){
         
    



    struct Person person1;
    struct Person person2;
    struct Person person3;
    printf("Enter details for person1:\n");
    takeInput(&person1);
    printf("\nEnter details for person2:\n");
    takeInput(&person2);

    showStruct(person1);
    showStruct(person2);
    printf("\nEnter details for person3:\n");
    takeInput(&person3);

    showStruct(person1);
    showStruct(person2);
    showStruct(person3);


    return 0;


}


