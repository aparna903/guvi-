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
	    char x,y;
	    Scanner sc=new Scanner(System.in);
	    x=sc.next().charAt(0);
	    y=sc.next().charAt(0);
	    if((x=='P' && y=='R')||(x=='R' && y=='P')){
	    	System.out.print('P');
	    	
	    }
	    else if((x=='P' && y=='S')||(x=='S' && y=='P')){
	    	System.out.print('S');
	    }
	    else if((x=='R' && y=='S')||(x=='S' && y=='R')){
	    	System.out.print('R');
	    }
	    else{
	    	
	    }
	}
}
