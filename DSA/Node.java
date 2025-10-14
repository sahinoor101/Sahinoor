public class Node {
    int num;
    Node next;

    public Node()
    {
        num=0;
        next=null;
    }

    public Node(int num)
    {
        this.num=num;
        next=null;
    }

    public void display() {
        System.out.println(num);
    }
    
}
