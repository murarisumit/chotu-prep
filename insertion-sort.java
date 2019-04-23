/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] a =  new int[]{5, 3, 8, 4, 9, 2};
		int key = 0, j;
		for(int i = 1; i < a.length; i++)
		{
           key = a[i];
           j = i - 1;
           
           while(j >= 0 && a[j] > key)
           {
               a[j+1] = a[j];
               j--;
           }
           a[j+1] = key;
		}
		
		for(int i = 0; i < a.length; i++)
		{
		    System.out.println(a[i]);
		}
	}
}
