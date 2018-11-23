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
		int a[]=new int[10];
		int k=1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		k=1;
		for(int j=0;j<n;j++){
			if(j==i){
				
			}
			else{
				k=k*a[j];
			}
		}
		System.out.println(k);
	}
	}
}
