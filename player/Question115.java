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
		String str1;
		
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		str1=sc.next();
		if(str.length()==str1.length()){
			System.out.print(str+str1);
		}
		else
		{
			if(str.length()>str1.length()){
				int n=str1.length();
				String s=str.substring(0,n);
			
					System.out.print(s+str1);
			}
			else{
				int n=str.length();
				String s=str1.substring(0,n);
				System.out.print(str+s);
			}
		}
	}
}
