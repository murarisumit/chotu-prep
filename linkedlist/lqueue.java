import java.util.*;

class queue
{
    qnode front ;
    qnode rear ;
    
    public void push(int d)
    {
        qnode temp = new qnode(d);
        if(this.front == null && this.rear == null )
        {
            this.front = temp;
            this.rear  = temp;
            this.rear.count = 1;
            this.front.count = 1;

        }
        else
        {
            qnode pos = new qnode();
            pos = this.front;
            while(pos.next != null)
            {
                pos = pos.next;
            }
            pos.next = temp;
            this.rear = pos.next;
        }
    }
    public int pop()
    {
        if(this.front == null  && this.rear == null)
        {
            System.out.println("Stack is underflow");
            return -1;
        }
        else
        {
            int d = this.rear.data;
            qnode pos = new qnode();
            pos = this.front;
            while(pos.next != null)
            {
                pos = pos.next;
            }
            this.rear= pos;
            return d;
        }

    }
    public void printstack()
    {
        qnode pos = new qnode();
        pos = this.front;
        while(pos != null)
        {
            System.out.println(pos);
            pos = pos.next;
        }
    }
    public static void main(String[] args)
    {
        queue s = new queue();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.printstack();
        System.out.println(s.pop()+" poped data ");
        s.printstack();
    }
}
 class qnode
{
    int data;
    qnode next;
    int count;

    public qnode(int d)
    {
        this.data = d;
    }
    public qnode(){}

    @Override
    public String toString() {
        return "qnode [count=" + count + ", data=" + data + ", next=" + next + "]";
    }
    
}