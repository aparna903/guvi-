#include <stdio.h>

int main(void) {
	// your code goes here
	int d[100],i,j,n,a=0,b=1,c,t=0;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		if(i%2){
			d[i]=i;
		}
		else{
			if(i<=2){
				d[i]=t;
				t++;
			
			}
			else{
				c=a+b;d[i]=c;
				a=b;
				b=c;
			}
		}
	}
	for(i=0;i<n;i++){
		printf("%d",d[i]);
		
	}
	return 0;
}
