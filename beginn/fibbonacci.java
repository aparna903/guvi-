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
		int[] a=new int[10];
		int n,i;
		a[0]=0;
		a[1]=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<(n+1);i++){
			a[i]=a[i-1]+a[i-2];
			
		}
		for(i=1;i<=n;i++){
				if(i==1){
			System.out.print(a[i]);}
			else{
				System.out.print(" ");
				System.out.print(a[i]);
				
			}
		
		}
		
	}
}
