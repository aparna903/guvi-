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
		String[] s=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		String str=s[0];
		for(int i=0;i<n;i++){
		         
			if(s[i].length()<str.length())
			str=(s[i]);
			
		         
		         }
		System.out.print(str);
		
	}
}
