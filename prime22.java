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
		int n=sc.nextInt();
		int m=sc.nextInt();
		int pr[]=new int[100];
		for(int i=n+1;i<m;i++)
		{

			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				cnt++;
			}
			if(cnt==2)
				System.out.print(i+" ");
			
		}
	}
}
