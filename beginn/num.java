/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner s1=new Scanner(System.in);
		
		i=s1.nextInt();
		if(i>0){
			System.out.println("Positve");
		}
		else if (i<0){
			System.out.println("Negative");
		}
		else{
			System.out.print("Zero");
		}
		
	}
}
