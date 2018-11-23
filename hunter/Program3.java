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
		int n,temp=0,k=0,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==i){
				b[k]=i;
				k++;
				count++;
			//	System.out.print(b[k]);
			}
		}if(count>0){
		if(k==1){
			System.out.print(b[0]);
		}
		else{
		for(int i=0;i<k-1;i++){
			System.out.print(b[i]+"# ");
		}
		System.out.print(b[k-1]);
		}
	}
	else{
		System.out.print("-1");
	}
	}
	
}
