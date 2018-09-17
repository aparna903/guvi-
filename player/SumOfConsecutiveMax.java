/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int Max(int n,int[] a){
		int count=0;
		for(int i=0;i<n-1;i++){
			
				if(a[i]>=a[i+1]){
					count+=a[i];
					
				}
				else{
					count+=a[i+1];
					
				}
				
			}
		
		return count;
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
		
		System.out.print(Max(n,a));
	}
}
