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
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int[] a=new int[m];
		int[] b=new int[n];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int k=0;
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		if(a[i]==b[j]){
			k++;
		          b[j]=-1;
		           if(k==1)
				System.out.print(a[i]);
				else
				System.out.print(" "+a[i]);
			
			
		}
		
}
}
	
	
	
	}
	
	
	
	
	
	
}
