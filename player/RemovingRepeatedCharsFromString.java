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
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		char[] c=str.toCharArray();
		String dum="";	
		
		for(int i=0;i<str.length();i++){
			{
			if(dum.indexOf(c[i])==-1){
				dum+=c[i];
			}
		}
		}
		System.out.print(dum);
	}
}
