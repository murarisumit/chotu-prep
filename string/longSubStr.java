import java.util.*;
class longSubStr
{
    public static void main(String[] args)
    {
        String X = "geeksforgeeks";
        String Y = "quizgeeks";
        String small ,large , substr = new String();
        int c = X.length() < Y.length() ? X.length() : Y.length();

        int len = 0;
        if(X.length() >= Y.length())
        {
            small = new String(Y);
            large = new String(X);   
        }
        else
        {
            small = new String(X); 
            large = new String(Y);
        }
        char[] carray = new char[c]; 
        for(int i = 0; i < large.length(); i++)
        {
            int k = 0;
            int posX = 0 ,posY = 0 ;
            int l = i;
            for(int j = 0 ; j < small.length() ; j++)
            {
              if( l < large.length())
                {
                if(Character.toLowerCase(large.charAt(l)) == Character.toLowerCase(small.charAt(j)))
                {
                    if(posX + 1 == j && posY + 1 == l)
                    {
                    posX = j;
                    posY = l;
                    carray[k] = small.charAt(j);
                    k++;
                    l++;
                    }
                    else if( posX == 0 && posY == 0)
                    {
                        posX = j;
                        posY = l;
                        carray[k] = small.charAt(j);
                        k++; 
                        l++;
                    }
                }
                }
                if(len < k)
                {
                len = k;
                substr = String.copyValueOf(carray); 
                }
            }

        }
        System.out.println(substr);
    }

}