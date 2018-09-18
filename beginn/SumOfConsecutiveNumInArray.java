/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 static int Sum(int n,int[] a){
		int sum=0;
		for(int i=0;i<n-1;i++){
			sum=sum+(a[i]+a[i+1]);
		
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}	
		System.out.print(Sum(n,a));
	}
}
