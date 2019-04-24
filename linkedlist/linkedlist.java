import java.util.*;
public class linkedlist
{
    node start;

    public void append(int d)
    {
        node temp = new node(d);
        if(this.start == null)
        {
          temp.count = 0;
          this.start = temp;
        }
        else
        {
          node pos = new node();
          pos = this.start;
          while(pos.next != null)
          {
              pos = pos.next;
          }
          temp.count = pos.count + 1;
          pos.next = temp;
        }
    
    }

    public void deletenode(int d)
    {
        node pos = new node();
        node pre = new node();
        pos = this.start;
        pre = this.start;
        if(this.start.data == d)
        {
         System.out.println(d+" Succesfully deleted");
         this.start  = this.start.next;
         this.start.count = 0;
         pos = this.start.next;
         while(pos != null)
                {
                    pos.count = pos.count - 1;
                    pos = pos.next;
                }
         System.gc(); 
        }
        else
        {
        while(pos!= null)
        {
            if(pos.data == d)
            {
                pre.next = pos.next;
                System.out.println(pos.data+" Succesfully deleted");
                pos = pos.next;
                while(pos != null)
                {
                    pos.count = pos.count - 1;
                    pos = pos.next;
                }
                System.gc(); 
                return;
            }
            pre = pos;
            pos = pos.next;
        }
        System.out.println(d+" Not found");
       }
	}
    public void printlist()
    {
        node pos = new node();
        pos = this.start;
        while(pos!= null)
          {
              System.out.println(pos);
              pos = pos.next;
          }
    }

    public void insertatk(int loc, int data) 
    {
        int k = loc - 1;
        node temp = new node(data);
        if(k == 0)
        {
            temp.next = this.start;
            this.start = temp;
            this.start.count = 0;
            node pos = new node();
            pos =  this.start.next;
            while(pos != null)
                {
                    pos.count = pos.count + 1;
                    pos = pos.next;
                }
        }
        else
        {
            node pos = new node();
            node pre = new node();
            pos = this.start;
            pre = this.start;
            while(pos!= null)
            {
                if(pos.count == k)
                {
                  pre.next = temp;
                  temp.next = pos;
                  temp.count = pos.count;
                  while(pos != null)
                  {
                    pos.count = pos.count + 1;
                    pos = pos.next;
                  }
                  return;
                }
                pre = pos;
                pos = pos.next;
            }

        }
	}
	
}
