class Node3 {
    String data;
    Node3 next;

    static Node3 createNode(String data) {
        Node3 node = new Node3();
        node.data = data;
        node.next = null;
        return node;
    }
}
