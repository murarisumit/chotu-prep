import java.util.*;

class stack
{
    snode top ;
    
    public void push(int d)
    {
        snode temp = new snode(d);
        if(this.top == null)
        {
            this.top = temp;
            this.top.count = 1;
        }
        else
        {
            temp.next = this.top;
            temp.count = this.top.count + 1;
            this.top = temp;
        }
    }
    public int pop()
    {
        if(this.top == null )
        {
            System.out.println("Stack is underflow");
            return -1;
        }
        else
        {
            int d = this.top.data;
            this.top = top.next;
            return d;
        }

    }
    public void printstack()
    {
        snode pos = new snode();
        pos = this.top;
        while(pos != null)
        {
            System.out.println(pos);
            pos = pos.next;
        }
    }
    public static void main(String[] args)
    {
        stack s = new stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.printstack();
        System.out.println(s.pop()+" poped data ");
        s.printstack();
    }
}
public class snode
{
    int data;
    snode next;
    int count;

    public snode(int d)
    {
        this.data = d;
    }
    public snode(){}

    @Override
    public String toString() {
        return "snode [count=" + count + ", data=" + data + ", next=" + next + "]";
    }
    
}