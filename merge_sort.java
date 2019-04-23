/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class merge_sort
{
	int[] arr;
	public void mergesort( int[] arr, int l, int h)
	{
		if(l < h)
		{
			int m = (l + h)/2;
			mergesort(arr, l, m);
			mergesort(arr, m+1, h);
			merge(arr,l,m,h);
		}
	}
	public void merge(int[] a, int l, int m, int h)
	{
		int k = l, i = l, j = m+1;
		int n1 = m + 1;
		int n2 = h - m;
		int[] b = new int[h+1];
		while(i < h+1)
		{
		 b[i] = a[i];
		 i++;
		}
        i = l;
		while(i <= m && j <= h) 
		{
			if(b[i] < b[j])
			{
			  a[k] = b[i];
			  k++;
			  i++;
			}
			else
			{
				a[k] = b[j];
				k++;
				j++;
			}	
		}
		if(i <= m)
		{
		  while(i <= m)
		  {
			  a[k] = b[i];
			  i++;
			  k++;
		  }
		}
		if(j <= h)
		{
		  while(j <= h)
		  {
			  a[k] = b[j];
			  j++;
			  k++;
		  }
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{

		merge_sort ms = new merge_sort();
		ms.arr = new int[]{6,8,3,4,12,5,10,16,2};
		ms.mergesort(ms.arr, 0, ms.arr.length-1);
		for(int i = 0; i < ms.arr.length; i++)
		{
		    System.out.println(ms.arr[i]);
		}
	}

	
}
