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
       
        String s1=sc.next();
        String s2=sc.next();
        boolean contains=false;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+2;j<s1.length();j++)
            {
                if(s2.contains(s1.substring(i,j)))
                {
                    contains=true;
                    break;
                }                    
            }
        }
        
        if(contains)
            System.out.println("yes");
        else
            System.out.println("no");

	}
}
