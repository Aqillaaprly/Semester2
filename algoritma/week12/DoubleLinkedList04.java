public class DoubleLinkedList04 {
    Node04 head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node04(null, item, null);
        } else {
            Node04 newNode = new Node04(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node04 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node04 newNode = new Node04(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            System.out.println("Index out of bound");
        } else {
            Node04 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node04 newNode = new Node04(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node04 newNode = new Node04(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node04 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n Succesfully addded");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is still empty, cannot remove");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is still empty, cannot remove"); 
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node04 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Index value is out of bound");
        } else if (size == 0) {
            removeFirst();
        } else {
            Node04 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list still empty");
        }
        return head.data;
    }

    public int getLast(int index) {
        if (isEmpty()) {
            System.out.println("Linked list still empty");
        }
        Node04 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) {
        if (isEmpty()) {
            System.out.println("Linked list still empty");
        }
        Node04 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}