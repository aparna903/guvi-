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
		String n;
		int p,k;
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		p=sc.nextInt();
		k=sc.nextInt();
		p=k+p;
		System.out.print(n.substring(p-1,p));
	}
}
