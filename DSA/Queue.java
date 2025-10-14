class Queue {
	public int size;
	public int[] queue;
	public int front = -1;
	public int rear = -1;

	public Queue(int size) {
		this.size = size;
		queue = new int[size];
	}

	public void enqueue(int number) throws Exception {
		if (rear == size - 1) {
			throw new Exception("Queue is full");
		}
		if (front == -1) {
			front = 0;
		}
		queue[++rear] = number;
	}

	public int dequeue() throws Exception {
		if (rear == -1)
			throw new Exception("Queue is empty");

		int n = queue[rear--];
		if (rear < front)
			front = rear = -1;

		return n;

	}
	public void display()
    {
        if (rear==-1) {
            System.out.println("Queue is emnpty");
            return;
        }
        System.out.println("ELEMENTS IN QUEUE");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
}