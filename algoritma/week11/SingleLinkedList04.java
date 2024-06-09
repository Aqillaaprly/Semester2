public class SingleLinkedList04 {
    Node04 head; // first position
    Node04 tail; // Last position in linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node04 tmp = head;
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

    public void addFirst(int input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput;
        } else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput;
        } else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        Node04 ndInput = new Node04(input, null);
        Node04 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node04(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public void insertBefore(int key, int input) {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.data == key) {
            addFirst(input);
            return;
        }
        Node04 temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next != null) {
            Node04 ndInput = new Node04(input, temp.next);
            temp.next = ndInput;
        } else {
            System.out.println("Key not found");
        }
    }


    public int getData(int index) {
        Node04 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(int key) {
        Node04 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else{
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else if(head == tail) {
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else if(head == tail) {
            head = tail = null;
        } else{
            Node04 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else{
            Node04 temp = head;
            while (temp != null) {
                if ((temp.data == key) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if(temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else{
            Node04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    } 
}