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
		int i=0,count=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		for(i=0;i<8;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<4;i++){
			if(2*a[i]==a[i+4]){
				count++;
			}
		}
		if(count==4){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}	
	}
}
