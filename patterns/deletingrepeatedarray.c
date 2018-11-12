#include <stdio.h>
void dist(int a[],int n);
int main(void) {
	// your code goes here
	int n;
	scanf("%d",&n);
	int a[100];
	for(int i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	dist(a,n);
	
	return 0;
}
void dist(int a[],int n){
	for(int i=0;i<n;i++){
		int j;
		for(j=0;j<i;j++){
			if(a[i]==a[j]){
				break;
			}
		}
			
		if(i==j){
			printf("%d",a[i]);
	}
}
}
