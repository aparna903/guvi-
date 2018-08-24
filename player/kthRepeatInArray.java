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
		int k,count=0;
		Scanner sc=new Scanner(System.in);
	           long m=sc.nextLong();
		k=sc.nextInt();
		while(m>0){
			long res=m%10;
			if(res==k){
				count++;
			}
			m=m/10;
		}
		System.out.print(count);
	}
}
