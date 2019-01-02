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
		String str,l;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		l=sc.next();
		int n=str.length();
		int k=str.indexOf('|');
		String str1="";
		String str2="";
		 str1=str1+str.substring(0,k);
		 str2=str2+str.substring(k+1,n);
		if(str1.length()-str2.length()==1){
			str=str+l;
			System.out.print(str);
		}
		else{
			System.out.print("Impossible");
		}
			}
}
