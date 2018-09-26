/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a<=0)&&(b<=0)&&(c<=0)){
		 System.out.print("no");
		}else{
			if((a+b<=c)||(c+a<=b)||(b+c<=a)){
				System.out.print("no");
			}
			else{
				int k=((a*a)+(b*b));
				int j=(c*c);
				if(k==j){
					System.out.print("yes");
				}
				else{
				System.out.print("no");
				}
			}
			
		}
		
	
	}
}
