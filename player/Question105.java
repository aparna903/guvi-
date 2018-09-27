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
		int[] b=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=a[i];
			
		}
		Arrays.sort(a);
		int k=0;
		for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
		 	if(a[i]==b[j]){
		 		if(k==0){
		 		System.out.print(j+1);
		 		k++;
		 		}
		 		else{
		 			System.out.print(" "+(j+1));
		 		}
		 		
		 	}
		 }
		}
		
	}
}
