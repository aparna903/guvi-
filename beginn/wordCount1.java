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
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
                    int count=0;
            if(str.charAt(0)!=' '){
                count++;
            }
            for(int i=0;i<str.length()-1;i++){
                if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
                    count++;
                }
                
                
            }
            System.out.print(count);

        

	}
}
