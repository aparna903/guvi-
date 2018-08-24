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
		int m,n,k=0;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<m;i++){
			if(a[i]==n){
				System.out.print("Yes");
				break;
			}
			else{
				k++;
				
			}
		}
		if(k>0){
			System.out.print("No");
		}
		
	}
	
}
