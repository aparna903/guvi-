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
		String s1;
		char a;
		int m,k=0;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		a=sc.next().charAt(0);
		 m=s1.length();
	for(int i=0;i<m;i++){
		if(s1.charAt(i)==a){
			k++;
		}
	}
	System.out.print(k);
			
	           
	}
}
