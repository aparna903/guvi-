#include <stdio.h>
char *getday(int num);
int main(void) {
	// your code goes here
	int num;
	scanf("%d",&num);
	printf("%s",getday(num));
	return 0;
}
char *getday(int num){
	char *str;
	switch(num){
		case 1:
		str="monday";
		break;
		case 2:
		str="tuesday";
		break;
		case 3:
		str="wednesday";
		break;
		case 4:
		str="thursday";
		break;
		case 5:
		str="friday";
		break;
		case 6:
		str="saturday";
		break;
		case 7:
		str="sunday";
		break;
	    default:
	    str="invalid";
	    break;
	
	}
	return str;
	
}
