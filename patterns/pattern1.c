#include <stdio.h>

int main(void) {
	// your code goes here
	int n,k;
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		k=1;
		for(int j=0;j<i;j++){
			printf("%d",i);
			if(k<i){
				printf("*");
				k=k+1;
			}
			
		}
		printf("\n");
	}
	for(int i=n;i>0;i--){
		k=1;
		for(int j=0;j<i;j++){
			printf("%d",i);
		if(k<i){
			printf("*");
			k=k+1;
		}	
		}
		printf("\n");
	}
	return 0;
}
