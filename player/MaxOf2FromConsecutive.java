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
		int n,k=0,l=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<(n-1);i++){
			if(a[i]>=a[i+1]){
				k=a[i];
				l++;}
				else{
				k=a[i+1];
				l++;
			}
			if(l==1)
			System.out.print(k);
			else
			System.out.print(" "+k);
		}
		
	}
}
