package DataStructuresImplementation;

import usage.Wombats;

public class LinkedLists {
    private static class Node {
        private Wombats data;
        private Node next;
        private Node (Wombats data){
            this.data = data;
        }
    }

    private Node head;

    public void append(Wombats data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(Wombats data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue (Wombats data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedList[");
        LinkedLists.Node current = head;

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append(']');
        return sb.toString();
    }
}
