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
			String s1,s2;
		int m,k=0;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		if(s1.length()==s2.length()){
		 for(int i=0;i<s1.length();i++){
		 	if(s1.charAt(i)==s2.charAt(i)){
		 		k++;
		 	}
		 }
		 	if(k>0)
                        	System.out.print("yes");
		           else{
		           	System.out.print("no");
		           }
			
		}
		else
		System.out.print("no");
	}
}
