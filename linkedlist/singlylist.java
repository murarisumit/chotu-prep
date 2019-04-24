import java.util.*;

public class singlylist
{
    public static void  main(String[] args) 
    {
     linkedlist list = new linkedlist();
     list.append(4); 
     list.append(49); 
     list.append(9); 
     list.append(19); 
     list.append(3); 
     list.printlist();  
     list.deletenode(4);
     list.printlist(); 
     System.out.println("hahahahah");
     list.insertatk(3,7); // insertion at specific position k insertatK(k,d);
     list.printlist(); 
    }
}