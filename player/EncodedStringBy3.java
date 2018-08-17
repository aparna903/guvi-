/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
				String str;
		char c=' ';
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=0;i<str.length();i++){
			int a=(int)(str.charAt(i));
			if(a>=120){
				a=a-26;
			a=a+3;
			c=(char)a;
				System.out.print(c);
			}
			else{
				a=a+3;
				c=(char)a;
				System.out.print(c);
			}
                     }
	}
}
