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
		int n,k=0,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if((a[i]==a[j])&&(i!=j)){
					b[k]=a[i];
				//	System.out.println(b[k]);
					k++;
					count++;
					break;
				}
			
			}
		}
		//System.out.print(k);
		int temp=0;
		for(int i=0;i<k;i++){
			if(a[i]>a[i++]){
				temp=a[i];
				a[i]=a[i++];
				a[i++]=temp;
			}
		}if(count>0){
		for(int i=0;i<k-1;i++){
			System.out.print(b[i]+" ");
		}
		System.out.print(b[k-1]);
	}
	else{
		System.out.print("unique");
	}
	}
}
