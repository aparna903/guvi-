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
		String s1;
		int k=0;
		Scanner sc=new Scanner(System.in);
		s1=sc.next()+'\0';
	            for(int i=0;s1.charAt(i)!='\0';i++){
                        k++;
	}
	System.out.print(k);
	}
}
