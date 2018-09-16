/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int Repeat(int n){
		int rem=0,i=0,k=0,flag=0;
		int[] a=new int[20];
		while(n!=0){
			rem=n%10;
			n=n/10;
			k++;
			a[i]=rem;
			i++;
		}
		for(i=0;i<k;i++){
			for( int j=i+1;j<k;j++){
				if(a[i]==a[j]){
				flag=1;
				break;
				}
			}
		}
			if(flag==0){
				System.out.print("no");
				
			}
			else
			System.out.print("yes");
			
			return 0;
		
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Repeat(n);
	}
}
