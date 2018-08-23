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
		int k,count=0;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		str1=sc.next();
		k=sc.nextInt();
		char[] c=str.toCharArray();
		
		char[] d=str1.toCharArray();
	
		for(int i=0;i<c.length;i++){
			    
				if(c[i]==d[i]){
					continue;
				}
				else{
						count++;
				
				}
		
		}
		
		if(count==k){
			System.out.print("yes");
		}
		else{

			System.out.print("no");
		}
		
		
	}
}
