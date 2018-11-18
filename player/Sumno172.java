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
		int n,rem,temp=0,i=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[10];
		while(n!=0){
			rem=n%10;
			a[i]=rem;
			n=n/10;
			i++;	
			}
		for(int k=0;k<i;k++){
			for(int j=0;j<k;j++){
			if(a[k]>a[j]){
				temp=a[k];
				a[k]=a[j];
				a[j]=temp;
			}
			}
		}
		for(int k=0;k<i;k++)
		System.out.print(a[k]);
	}
}
