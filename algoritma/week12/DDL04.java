public class DDL04 {
    public static void main(String[] args) {
        DoubleLinkedList04 DLL = new DoubleLinkedList04();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.addFirst(3);
        DLL.addLast(4);
        DLL.addFirst(7);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.add(40, 1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.clear();
        DLL.print();
        System.out.println("Size : " + DLL.size());

        DLL.addLast(50);
        DLL.addLast(40);
        DLL.addLast(10);
        DLL.addLast(20);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.removeFirst();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.removeLast();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.remove(1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        DLL.clear();

        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.addFirst(3);
        DLL.addLast(4);
        DLL.addFirst(7);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.add(40, 1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        System.out.println("Data in the head of linked list is : " + DLL.getFirst());
        System.out.println("Data in the tail of linked list is : " + DLL.getLast(0));
        System.out.println("Data in the 1st index linked list is : " + DLL.get(1));
    } 
}

