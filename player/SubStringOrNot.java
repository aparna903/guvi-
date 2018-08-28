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
		String str,str1;

		Scanner sc=new Scanner(System.in);
		str=sc.next();
		str1=sc.next();
		if(str.contains(str1)){
			System.out.print("yes");
		
		}
		else{
			System.out.print("no");
		}
		
	}
}
