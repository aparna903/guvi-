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
		int m,n,rem=0;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int i=m;
		while(i>=m&&i<=n){
			
			if(i%2!=0){
				rem+=i;
			}
			i++;
		}
		System.out.print(rem);
	}
}
