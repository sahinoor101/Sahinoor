public class LinkList {
    Node start;

    public LinkList()
    {
        start=null;
    }

    public LinkList(Node n)
    {
        start=n;
    }

    public void display()
    {
        Node temp=start;
        while (temp!=null) {
            temp.display();
            temp=temp.next;
        }
    }

    public void insertAtBegining(Node n)
    {
        if(start==null)
        {
            start=n;
            return;
        }
        n.next=start;
        start=n;
    }

    public void insertAtEnd(Node n)
    {
        Node temp=start;
        if(start==null)
        {
            start=n;
            return;
        }
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=n;
    }

    public void insertAtAnyPoint(Node n)
    {
        
    }
}
