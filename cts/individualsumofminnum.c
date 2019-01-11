/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
int getdigitsum(int *arr,int);
int getsum(int);
int main()
{
int arr[100],i,len;
scanf("%d",&len);
for(i=0;i<len;i++){
    scanf("%d",&arr[i]);
}   
printf("%d",getdigitsum(arr,len));
return 0;
}
int getdigitsum(int *arr,int len){
    int min,i,x;
    min=arr[0];
    for(int  i=1;i<len;i++){
        if(min>arr[i]){
            min=arr[i];
        }
    }
    x=getsum(min);
    if(x%2==0){
        return 1;
    }
    else{
        return 0;
    }
}
int getsum(int num){
    int sum=0;
    while(num>0){
        sum=sum+(num%10);
        num=num/10;
    }
    return sum;
}
