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
		int m,n,sq=1;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int res=m*n;
                        int temp=(res)/2;
		for(int i=temp;i>0;i--){
		 sq=i*i;
		 if(sq==res){
		 	 	break;
		 }
			
		}
		if(sq==res){
			System.out.print("yes");
		}
		
		else{
			System.out.print("no");
		}
		
	}
}	
	
