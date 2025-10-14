// import java.util.*;
class Stack{
    public int size;
    public int[] stack;
    public int top=-1;

    public Stack(int size)
    {
        this.size = size;
        stack = new int[size];
    }

    public void push(int number)throws Exception
    {
           if(top==size-1)
           {
                throw new Exception("Stack full");
           }
           stack[++top] = number;
    }

    public int pop()throws Exception
    {
        if(top==-1)
        {   
            throw new Exception("Stack empty");
        }
        int n=stack[top--];
        // System.out.println(n);
        return n;
    }
    public int peek()throws Exception
    {
        if (top==-1) {
            throw new Exception("Stack empty");
        }
        // System.out.println(stack[top]);
        return stack[top];
    }
    public void display()
    {
        if (top==-1) {
            System.out.println("Stack is emnpty");
            return;
        }
        System.out.println("ELEMENTS IN STACK");
        for(int i=0;i<=top;i++)
        {
            System.out.println(stack[i]);
        }
    }
}
