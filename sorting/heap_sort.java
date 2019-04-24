/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class heap_sort
{
    public void heapsort(int[] a, int n)
    {
        int temp;
        for(int i = n/2-1; i >= 0; i--)
        {
            heapify(a,n,i);
        }
        for(int i = n-1; i >= 0; i--)
        {
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
	
    private void heapify(int[] a, int n, int i) 
    {
        int large = i;
        int temp;
        int l = i*2 + 1;
        int r = i*2 + 2;
        if(l < n && a[l] > a[i] && a[l] > a[r])
        {
            large = l;
        }
        if(r < n && a[r] > a[i] && a[r] > a[l])
        {
            large = r;
        }
        if( large != i)
        {
            temp = a[i];
            a[i] = a[large];
            a[large] = temp;
            heapify(a, n, large);
        }
    }

    public static void main(String[] args) throws java.lang.Exception
	{
        int[] a =  new int[]{5,3,8,4,9,2,11,1};
        heap_sort hs = new heap_sort();
        hs.heapsort(a, a.length);
		for(int i = 0; i < a.length; i++)
		{
		    System.out.println(a[i]);
		}
    }
}

