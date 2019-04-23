/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] a =  new int[]{5,3,8,4,9,2};
		int temp;
		for(int i = 0; i < a.length; i++)
		{
		    for(int j = 0; j < a.length - i - 1; j++)
		    {
		        if(a[j] > a[j+1])
		        {
		            temp = a[j];
		            a[j] = a[j+1];
		            a[j+1] = temp;
		        }
		    }
		}
		
		for(int i = 0; i < a.length; i++)
		{
		    System.out.println(a[i]);
		}
	}
}
