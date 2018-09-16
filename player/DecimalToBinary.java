/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static void Binary(int n){
		int[] a=new int[n];
		int i=0;
		while(n>0){
			a[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--){
			System.out.print(a[j]);
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Binary(n);
		
	}
}
