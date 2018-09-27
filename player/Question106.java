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
                           int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
			
		}
	
	            Arrays.sort(a);
	            int j=0;
	            int[] k=new int[10];
		for(int i=0;i<n-1;i++){
		if(a[i]!=a[i+1]){
			
		k[j++]=a[i];
                  	
		}
		}
		k[j++]=a[n-1];
		for(int i=0;i<j;i++){
			if(i==0)
			System.out.print(k[i]);
			else
			System.out.print(" "+k[i]);
		}
	}
}
