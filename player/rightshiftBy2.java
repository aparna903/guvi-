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
		int k,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			a.add(m);
		}
		Collections.rotate(a,k);
		int x=a.size();
		for(int i=0;i<x;i++){
			if(i<x-1){
			System.out.printf("%d ", a.get(i));
			}
			else{
				System.out.printf("%d",a.get(i));
			}
		}
		
	
	}
}
