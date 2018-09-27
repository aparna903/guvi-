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
		
		int[] b=new int[10];
		int k=n-2;;
		int temp=0;
	            for(int i=0;i<n;i++){
	            	
	            	temp+=a[i];
	            }
	            System.out.print(temp);
	           for(int i=k;i>=0;i--){
	           temp=(temp-a[i]);
	           System.out.print(" "+temp);
	           }
	}
}
