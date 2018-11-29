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
		int n,a,b,k,m,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		k=n/a;
		m=n/b;
		if(n%2==0){
		for( int i=1;i<k;i++){
			for(int j=1;j<m;j++){
				if(((a*i)+(b*j))==n){
					count=1;
				}
			}
		}
		if(count==1){
			System.out.print("YES");
		}	
		}
		else
		System.out.print("NO");
		}
	
}
