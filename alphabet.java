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
		char letter=sc.next().charAt(0);
		if(letter>=65&&letter<=122)
		{
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
				
			}
		}
			else
			{
				System.out.println("invalid");
			}
	
	}
}
