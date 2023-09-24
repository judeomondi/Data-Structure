package DataStructuresImplementation;
import usage.Wombats;

public class Queue {

    private static class Node {
        private Wombats data;
        private Node next;
        private Node(Wombats data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public Wombats peek (){
        return head.data;
    }

    public void add(Wombats data){
        Node node = new Node(data);
        if (tail != null){
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public Wombats remove(){
        Wombats data = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue{");
        Node current = head;

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append('}');
        return sb.toString();
    }
}
