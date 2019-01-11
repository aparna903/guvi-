#include <stdio.h>
void printtable(int);
int main(void) {
	// your code goes here
	 int num;
    scanf("%d",&num);
    printtable(num);

	return 0;
}
void printtable(int num){
    int i;
    for(int i=1;i<=num;i++){
    	
        printf("%d",num*i);
        if(i<num){
        	printf(" ");
        }
        
    }
    printf("\n");
    for(i=1;i<=num;i++){
    	printf("%d*%d=%d\n",num,i,num*i);
    }
}
