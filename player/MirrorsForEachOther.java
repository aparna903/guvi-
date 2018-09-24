/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		int n,sum=0,k=0,count=0;
	
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=n-1;
		int[] a=new int[n];
		int [] b=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==b[k]){
			
			count++;	
			}
			k--;
		}
		if(count==n){
		System.out.print("yes");}
		else
		System.out.print("no");
		
	}
}
