
using Datastructures.Structure;
public class Program {

    static void Main(String[] args) {

        Console.WriteLine("Hello, World!");

        Queue queue = new Queue();

        queue.add("Omosh");
        queue.add("Gilbeys");
        queue.add("Bazuu");
        queue.add("Top G");
        queue.remove();
        Console.WriteLine(queue);


        Stack stack = new Stack();
        stack.push("Omosh");
        stack.push("Gilbeys");
        stack.push("Bazuu");
        stack.push("Top G");
        stack.pop();
        Console.WriteLine(stack);


        LinkedList linkedList = new LinkedList();
        linkedList.append("Avidan");
        linkedList.prepend("Gunar");
        linkedList.append("Jude");
        linkedList.append("Elvis");
        Console.WriteLine(linkedList);


        //Binary Trees
        Node node1 = new Node(10);
        node1.insert(20);
        node1.insert(5);
        node1.insert(55);
        node1.insert(47);
        node1.insert(90);
        node1.insert(3);

        node1.printInOrder();
        Console.WriteLine(" ");
        node1.printPreOrder();
        Console.WriteLine(" ");
        node1.printPostOrder();

        //Tries
        Trie trie = new Trie();
        trie.insert("Apple");
        trie.insert("Application");
        trie.insert("Applicative");

        Console.WriteLine(trie.containsPrefix("Ap"));
        trie.delete("Application");
        Console.WriteLine(trie.contains("Application"));


        

    }

   

    
}


