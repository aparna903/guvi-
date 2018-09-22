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
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=i){
					System.out.print("*");
				}
				else{
					System.out.print("#");
				}
				}
				System.out.println();
		}
	}
}
