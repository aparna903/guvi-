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
			String[] str=new String[10];
		
		Scanner sc=new Scanner(System.in);
		 int k=sc.nextInt();
		for(int i=0;i<k;i++){
		str[i]=sc.next();
		}for(int i=0;i<k;i++){
			
		      for(int j=0;j<str[i].length();j++){
		char[] c=new char[10];
		c=str[i].toCharArray();
		Arrays.sort(c);
		if(i==0)
		System.out.print(c);
		
		if(i>0){
		System.out.print(" ");
		System.out.print(c);
		}
		break;
		}
	
	}
		
	}
}
