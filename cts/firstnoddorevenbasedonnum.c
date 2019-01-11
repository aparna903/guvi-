#include <stdio.h>
void printpattern(int num);
int main(void) {
	// your code goes here
	int num;
	scanf("%d",&num);
	printpattern(num);
	
	return 0;
}
void printpattern(int num){
	int i,print;
	if(num%2==0){
		print=0;
	
		for(i=0;i<num;i++){
			printf("%d",print);
			print=print+2;
		}
	}
	else{
		print=1;
		for(i=0;i<num;i++){
		printf("%d",print);
		print=print+2;
		}
	}
}

