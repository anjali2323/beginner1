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
	int count=0,i=0;
	String s=sc.nextLine();
	// arr[]=s.split("\t");
	int k=s.length();
	k=k-1;
		//System.out.print(k);

	for(i=0;i<k;i++)
	{
		if(s.charAt(i)==' ')
		count++;
	}
	System.out.println(""+count);
	}
}
