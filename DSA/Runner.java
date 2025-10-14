public class Runner {
    public static void main(String[] args) {
        Node n=new Node(15);
        LinkList list=new LinkList(n);
        // list.display();
        list.insertAtBegining(new Node(10));
        list.insertAtEnd(new Node(9));
        list.display();
    }
}
