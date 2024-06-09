public class SLL {
    Node2 head; // First node in the linked list
    Node2 tail; // Last node in the linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node2 tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(String input) {
        Node2 ndInput = new Node2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input) {
        Node2 ndInput = new Node2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String input) {
        Node2 ndInput = new Node2(input, null);
        Node2 temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }
    }

    public void insertBefore(String key, String input) {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.data.equals(key)) {
            addFirst(input);
            return;
        }
        Node2 temp = head;
        while (temp.next != null && !temp.next.data.equals(key)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            Node2 ndInput = new Node2(input, temp.next);
            temp.next = ndInput;
        } else {
            System.out.println("Key not found");
        }
    }
}