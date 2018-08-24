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
		String str;
		int c=1;
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		str=str.replaceAll(" ","");
		str=str.toLowerCase();
		char[] a=str.toCharArray();
	             int[] x=new int[a.length];
	//	System.out.print(a);
		for(int i=0;i<a.length;i++){
			c=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
				c++;
				a[i]=a[j];
				
			}
			x[i]=c;
 
 
			}
			}
			
			//System.out.print(x[0]);
			int min=x[0];
			for(int i=0;i<x.length;i++){
				if(min>x[i]){
					min=x[i];
				
		//	System.out.print(x[i]);
				}
			}
 
		// System.out.print(min);
 int k=0;
			for(int i=0;i<a.length;i++){
 
			   	if(x[i]==min){
                                                       k++;
                                                       if(k==1)
				System.out.print(a[i]);
				else{
					System.out.print(" "+a[i]);}
				}
			}
 
 
	}
}
