public class Stack {
    public static Node3 head = null;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(String data) {
        Node3 newNode = Node3.createNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static String pop() {
        if (isEmpty()) {
            System.out.println("Pop from empty stack");;
        }
        Node3 poppedNode = head;
        head = head.next;
        return poppedNode.data;
    }

    public static String peek() {
        if (isEmpty()) {
            System.out.println("Peek from empty stack");
        }
        return head.data;
    }

    public static void display() {
        Node3 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
}
