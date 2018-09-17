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
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int temp=0,count,k;
		k=sc.nextInt();
		for(int i=0;i<k;i++){
			count=0;
			for(int j=0;j<str.length();j++){
				if(Integer.parseInt(str.substring(j,j+1))==i){
					count=1;
				}
			}
			if(count==1){
				temp++;
			}
		}
		if(k==temp){
		System.out.print("yes");
		}
		else
		System.out.print("no");
	}
}
