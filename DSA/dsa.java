import java.util.*;

class dsa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter Size of Stack/Queue");
        size = sc.nextInt();
        System.out.println("--------------------------------------------------------------");
        Stack st = new Stack(size);
        Queue q = new Queue(size);

        try {
            q.enqueue(5);
            q.enqueue(7);
            q.enqueue(3);
            q.dequeue();
            q.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            st.push(5);
            st.push(3);
            st.push(2);
            st.pop();
            // st.peek();
            // st.pop();
            // st.pop();
            st.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}