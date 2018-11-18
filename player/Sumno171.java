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
String temp="";
String[] s=str.split(" ");
for(int j=0;j<s.length;j++){ 
if(s[j].equals("and")){
temp=s[j-1];
s[j-1]=s[j+1];
s[j+1]=temp;
}

}
String st="";
int i;
for(i=0;i<s.length-1;i++){

st=st+s[i]+" ";
}
st=st+s[i];
System.out.print(st);

	}
}
