/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int avg=0;
		for(int i=0;i<n;i++)
		{
			avg=avg+a[i];
	}
	int avg1=avg/n;
	System.out.println(avg1);
}
}
