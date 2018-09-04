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
		int m,n,k=0;
		Scanner sc=new Scanner(System.in);
		s1=sc.next().toLowerCase();
		s2=sc.next().toLowerCase();
		 m=s1.length();
		n=s2.length();
		if(m==n){
	            for(int i=0;i<n;i++){
                        if(s1.charAt(i)==s2.charAt(i)){
                        	k++;
                        }
                	}
                	if(k==n){
                		System.out.print("yes");
                	}
                	else
                	System.out.print("no");
		}
		else{
			System.out.print("no");
		}
	
	}
}
