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
		int x1,y1,x2,y2,x3,y3;
		Scanner sc=new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		x3=sc.nextInt();
		y3=sc.nextInt();
		int a=(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
		if(a==0){
			System.out.print("yes");
			
		}
		else{
			System.out.print("no");
		}
		
	}
}
