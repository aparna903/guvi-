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
		int n,k=1,l=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++){
			if(a[i]>=a[i-1]){
				l++;
				
				
			}
			else{
				if(k<l){
					k=l;
					l=1;
				}
			}
		
			//	System.out.print(k+" ");
		}
		if(k<l)
			System.out.print(l);
			else
			System.out.print(k);
			
	
		
	}
}
