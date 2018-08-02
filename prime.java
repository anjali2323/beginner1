/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,i=2;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		boolean flag=false;
		while(i <= num/2)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			++i;
		
	}
	if(flag)
	System.out.println(num + "is prime number.");
	
	else
	System.out.println(num + "is not a prime number.");
}
}
