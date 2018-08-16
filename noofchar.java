/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		int count=0,i=0;
		for(i=0;i<S.length();i++)
		{
			if(S.charAt(i)!=' ')
			{
				count++;
			}
		}
			System.out.println(""+count);
	}
}
