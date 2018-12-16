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
		String str=sc.next();
		String s="dhoni";
		int count=0;
		if(str.length()!=s.length()){
			System.out.print("no");
		}
		else{
			for(int i=0;i<str.length();i++){
						String ch=String.valueOf(str.charAt(i));

				if(s.contains(ch)){
					count++;
				}
			}
			if(count==s.length()){
				System.out.print("yes");
			}
			else{
				System.out.print("no");
			}
			
		}
	}
}
