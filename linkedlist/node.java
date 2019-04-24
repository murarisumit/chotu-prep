public class node
{
    int data;
    node next;
    int count;

    public node(int d)
    {
        this.data = d;
    }
    public node(){}

    @Override
    public String toString() {
        return "node [count=" + count + ", data=" + data + ", next=" + next + "]";
    }
    
}
