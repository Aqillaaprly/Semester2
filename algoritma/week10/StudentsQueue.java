public class StudentsQueue {
    int max;
    int front;
    int rear;
    int size;
    Students[] stdQueue;

    public StudentsQueue(int max) {
        this.max = max;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.stdQueue = new Students[max];
    }

    public void create() {
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Students student) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % max;
        stdQueue[rear] = student;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int frontIndex = front;
        front = (front + 1) % max;
        size--;
        return frontIndex;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.println(stdQueue[i].toString());
            i = (i + 1) % max;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("First in Queue: " + stdQueue[front].toString());
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Last in Queue: " + stdQueue[rear].toString());
    }

    public void peekPosition(String nim) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            if (stdQueue[i].nim.equals(nim)) {
                System.out.println("Student at position: " + (count + 1) + ", Data: " + stdQueue[i].toString());
                return;
            }
            i = (i + 1) % max;
        }
        System.out.println("Student with NIM " + nim + " not found in queue");
    }

    public void printStudents(int position) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        int index = (front + position - 1) % max;
        System.out.println("Student at position " + position + ": " + stdQueue[index].toString());
    }
}
