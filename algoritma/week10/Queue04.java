public class Queue04 {
    int max, size, front, rear;
    int[] q;

    public Queue04(int n) {
        max = n;
        Create();
    }

    public void Create() {
        q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("The first element: " + q[front]);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % max;
        q[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }
        int removedValue = q[front];
        front = (front + 1) % max;
        size--;
        if (isEmpty()) {
            front = rear = -1;
        }
        return removedValue;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.print(q[i] + " ");
            System.out.println("\nElement amount: " + size);
        }
    }

    public void clear() {
        Create();
    }
}
