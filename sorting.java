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
		int n,temp;
		int a[]=new int[10];
		
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		    	if(a[i]>a[j])
		    	{
		    		temp=a[i];
		    		a[i]=a[j];
		    		a[j]=temp;
		    	}
		    }
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		
	}
	System.out.print(a[n-1]);
	}
}
