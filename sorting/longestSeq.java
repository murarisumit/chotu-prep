import java.util.*;

class longestSeq
{
    public static int seq (int[] a)
    {
        int n = a.length;
        int count = 1, max = 0;
        for(int i = n-1; i >= 0; i--)
        {
            count = longSeq(a,i,i-1,max);
            System.out.println(count);
            if(count > max )
            {
                max = count;
            }
        }
        return max;
    }

    private static int longSeq(int[] a, int i, int j, int max) 
    {
        if (i == 0 || j == -1)
        {
        return 0;
        }
        else if (a[i] > a[j])
        {

            max = 1 + longSeq(a, j, j-1, max);
        }
        else if (a[i] < a[j])
        {
            max =  longSeq(a, i, j-1, max);
        }
        return max;
        
    }
    public static void main(String[] args)
    {
        int[] a = new int[]{1, 2, 4, 5, 7};
        int max = seq(a);
        System.out.println("max is "+max);
    }
}