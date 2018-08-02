/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int limit=50;
		System.out.println("parint even numbers between between 1 to 50");
		for(i=2;i<=50;i++)
		if(i%2==0)
		System.out.println(i+" ");
	}
}
