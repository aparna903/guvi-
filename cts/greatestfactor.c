#include <stdio.h>
int checkfactor(int num);
int calculatefact(int num);
int main(void) {
	// your code goes here
	int num;
	scanf("%d",&num);
	printf("%d",checkfactor(num));
	return 0;
}
int calculatefact(int num){
	int i,fact=0;
	for(i=1;i<=num/2;i++){
		if(num%i==0)
		fact=i;
	}
	return fact;
	
}
int checkfactor(int num){
	if(num==0){
		return 0;
		
	}
	else{
		return calculatefact(num);
	}
}
