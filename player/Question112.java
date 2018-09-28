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
		int m;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		int[] a=new int[m];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				k++;
			}
		}
	 System.out.print(k);
		
}
}
	
