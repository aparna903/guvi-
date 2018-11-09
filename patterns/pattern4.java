#include <stdio.h>

int main(void) {
	// your code goes here
		int n;
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			printf("%d",i);
			if(j<i){
				printf("*");
			}
		}
		printf("\n");
	}
	for(int i=n;i>0;i--){
		for(int j=1;j<=i;j++){
			printf("%d",i);
			if(j<i){
				printf("*");
			}
		}
		printf("\n");
	}

	return 0;
}
