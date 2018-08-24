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
			String text;
		Scanner sc=new Scanner(System.in);
		text=sc.nextLine();
if(text.indexOf("  ")>0){
 while(text.indexOf("  ") >= 0)
{
	
text = text.replaceAll("  "," ");
}
System.out.print(text);
}

else{
	text=text.replaceAll(" ","");
	System.out.print(text);
}
}
	
}
