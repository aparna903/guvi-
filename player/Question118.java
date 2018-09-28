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
		str=sc.nextLine();
		String[] s=str.split(" ");
		for(int i=0;i<s.length-1;i++){
			if((s[i].length())>=(s[i+1].length()))
			System.out.print(s[i]);
			else
			System.out.print(s[i+1]);
		}
		
	}
}
