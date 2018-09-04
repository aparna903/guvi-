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
		s1=sc.nextLine();
		s2=sc.next();
		String[] s=s1.split(" ");
		 for(int i=0;i<s.length;i++){

		 	if(s[i].equals(s2))
		 	k++;
		 	
		 }
		 System.out.print(k);
		 }
}
