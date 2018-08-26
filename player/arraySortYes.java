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
		int n,k=0;
		int[] a=new int[100];
		Scanner c=new Scanner(System.in);
		n=c.nextInt();
		for(int i=0;i<n;i++){
			a[i]=c.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(a[i]<a[i+1]){
			k++;	
			}
		}
		if((n-1)==k)
	             System.out.print("yes");
		else
		System.out.print("no");
	}
}
