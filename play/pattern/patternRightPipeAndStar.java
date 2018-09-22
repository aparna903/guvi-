import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i=1;i<=y;i++){
			for(int j=1;j<=x;j++){
				if(j==1&&i<y){
					System.out.println("|");
					
				}
				else if(i==y&&j==1){
					System.out.print("*");
				}
				else if(i==y&&j<=x){
					System.out.print("-");
				}
				else{
					
				}
				
			}
		}
		
	}
}
