public class QueueUsingStack extends Stack {

    int size;
    int[] temp;

    public QueueUsingStack(int size) {
        super(size);
        this.size = size;
        temp = new int[size];
    }

    public void enqueue(int n) throws Exception {
        try {
            super.push(n);

        } catch (Exception e) {
            throw new Exception("Queue Is full");
        }
    }

    public int dequeue() throws Exception {
        if (super.top == -1) {
            throw new Exception("Queue is empty");
        }
        int i, n, top = super.top;
        for (i = 1; i <= top; i++) {
            // System.out.println("-"+super.top);
            temp[i - 1] = super.pop();
        }
        // super.display();
        n = super.pop();
        for (i = 0; i < top; i++) {
            super.push(temp[i]);
        }
        // super.top--;
        return n;
    }

    public static void main(String args[]) {
        int size = 5;
        QueueUsingStack quack = new QueueUsingStack(size);
        try {
            quack.enqueue(1);
            quack.enqueue(2);
            quack.enqueue(3);
            quack.enqueue(4);
            quack.enqueue(5);
            quack.display();
            quack.dequeue();
            quack.dequeue();

            quack.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
