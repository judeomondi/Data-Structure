package DataStructuresImplementation;

public class Stacks {

    private static class Node {
        private String data;
        private Node next;
        private Node (String data) {
           this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top == null;
    }

    public String peek(){
        return top.data;
    }

    public void push (String data) {
        Node node  = new Node(data);
        node.next = top;
        top = node;
    }

    public String pop (){
        String data = top.data;
        top = top.next;
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack[");
        Stacks.Node current = top;

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
