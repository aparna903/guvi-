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
		Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1="";
int count=0;
for(int i=0;i<s.length();i++)
{
String v=String.valueOf(s.charAt(i));
if(!s1.contains(v))
{
s1=s1+v;
}
}
for(int i=0;i<s1.length();i++)
{
if(((s1.charAt(i)>='A')&&(s1.charAt(i)<='Z'))||((s1.charAt(i)>='a')&&(s1.charAt(i)<='z')))
{
count++;
}
}
if(count==26)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}


	}
}
