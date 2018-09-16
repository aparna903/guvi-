/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int Decimal(long n){
		long b=n;
		int  d=0;
		int power=0;
		while(b!=0){
		long ld=b%10;
			b=b/10;
			d+=ld*Math.pow(2,power);
			power++;
		}
		return(d);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		long n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		System.out.print(Decimal(n));
	}
}
