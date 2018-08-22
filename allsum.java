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
		int a,sum=0;
		a=sc.nextInt();
		int k=0;
	           while(a!=0)
	           {
	           	k=a%10;
	           	sum=sum+k;
	           	a=a/10;
	           }
		System.out.print(sum);
	}
}
