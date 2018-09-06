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
			int n,x;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int k,y=0;
		for(int i=0;i<n;i++){
			k=a[i];
	
			for(int j=0;j<n;j++){
				if(a[i]==a[j]){
					y++;
					if(y==x)
					System.out.print(a[j]);
					}
			}
			
				
			}
		
	}
}
