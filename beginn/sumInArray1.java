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
		int m,sum;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			
		}
		sum=0;
		for(int i=0;i<m;i++){
			sum=sum+a[i];
		}
		System.out.print(sum);
		
	}
}