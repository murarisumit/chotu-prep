import java.util.*;

class split
{
    int count;
    public String[] splitF( String s,char k)
    {
        String[] word = new String[s.length()];
        int  j = 0;
        this.count = 0;
        char split_char = Character.toLowerCase(k);
        char c1[] = new char[s.length()];
        for(int i = 0;i < s.length(); i++)
        {
            if(Character.toLowerCase(s.charAt(i)) != split_char)
            {
                c1[j] = s.charAt(i);
                j++;
            }
            else if(Character.toLowerCase(s.charAt(i)) == split_char ) 
            {
                char c[] = new char[s.length()];
                for(int v = 0 ;v < j;v++)
                {
                    c[v] = c1[v];
                }
                word[this.count] = String.copyValueOf(c);
                this.count++;
                j = 0;
            }
            
        }
        word[this.count] = String.copyValueOf(c1);
        this.count++; 

        return word;

    }
    public static void main(String[] args) 
    {
        split sp = new split();
        String sample_string = "haakakhaaaaKhaaaakhaaaa";
        String[] split_string = new String[sample_string.length()];
        split_string = sp.splitF( sample_string, '/');
        for(int i = 0;i < sp.count; i++)
        {
            if(split_string[i] != "" || split_string[i] != null)
            {
               System.out.println(split_string[i]);
            }
        }
        
    }
}