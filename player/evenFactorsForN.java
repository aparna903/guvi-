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
		int n,c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++){
			i++;
			if(n%i==0){
				c++;
			if(c==1){
				System.out.print(i);}
				else{
					System.out.print(" "+i);
				}
			}
		}
		
	}
}
