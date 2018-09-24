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
                  int max=a[0],min=0,diff=0;
         	         for(int i=0;i<n;i++){
         	          for(int j=0;j<n;j++){
         	             	if(a[j]>max)	{
         	             		max=j;
         	             	}
         	             	if(a[j]<min){
         	             		min=j;
         	             	}
         	             	}
         	             }
         	             diff=max-min;
         	             System.out.print(diff);
         	            
		
	}
}
