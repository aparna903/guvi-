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
		int c=0;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		char[] a=str.toCharArray();
		for(int i=0;i<a.length;i++){
			
			if(a[i]=='('){
			c++;	
			}
			if(a[i]==')'){
				c--;
			}
		}
		if(c==0){
		System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
