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
		int n,k,m=0;
		Scanner c=new Scanner(System.in);
		n=c.nextInt();
		k=c.nextInt();
		int rem=1;
		while(n>=rem){
			rem=rem*k;
			if(rem==n){
			m++;	
			System.out.print("yes");
			break;
			}
			
		}
		if(m==0)
		System.out.print("no");
		
	}
}
