#include<stdio.h>
#include<string.h>

int vowelCount(char ch){
    ch = tolowercase(ch);
    return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
}
int alphaCount(char ch){
     if(ch>="a" && ch<="z"){
        return 1;
     }
     else 
        return 0;
}

int main(){
    char letter[100];
    int count =0;
    printf("Enter a String");
    scanf("%s",letter);
   
    int res = vowelCount(letter);
}