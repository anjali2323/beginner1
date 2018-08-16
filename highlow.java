/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[30];
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			max=a[i];
		}
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			min=a[i];
		}
		System.out.print(min);
		System.out.println(" ");
		System.out.println(max);
		}
		
		}
	
