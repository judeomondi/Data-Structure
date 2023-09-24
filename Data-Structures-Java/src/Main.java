import DataStructuresImplementation.*;
import DataStructuresImplementation.Queue;
import usage.Wombats;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String [] greet = {"Bonjour", "Hello", "Priviet", "Sasa", "Niaje", "Salamu"};

        Stacks greeting = new Stacks();
        for(String greets : greet){
            greeting.push(greets);
        }
        System.out.println(greeting);


        Wombats jude = new Wombats(14, 2, "Jude");
        Wombats avi = new Wombats(19,4, "Avi");
        Wombats vlad = new Wombats(19,5, "Vlad");
        Wombats elvis = new Wombats(10,3, "Elvis");
        Wombats daddy = new Wombats(20,1, "Daddy");

        //Queues
        //for linkedlists you can access an item at any node
        Queue wombats = new DataStructuresImplementation.Queue();
        wombats.add(jude);
        wombats.add(avi);
        wombats.add(vlad);
        wombats.add(elvis);
        wombats.add(daddy);

        System.out.println(wombats);
        System.out.println(wombats.peek());


        //Lists
        List<Wombats> arranged = new ArrayList<>();
        arranged.add(jude);
        arranged.add(avi);
        arranged.add(vlad);
        arranged.add(elvis);
        arranged.add(daddy);

        Collections.sort(arranged);
        System.out.println(arranged);

        //stack implementation - bracket checker
        char [] opening = {'{'};
        char [] closing = {'}'};

        BracketChecker bracketChecker = new BracketChecker(opening, closing);
        boolean isCorrect = bracketChecker.checker("{}{");

        if (isCorrect) {
            System.out.println("Syntax Correct");
        } else {
            System.out.println("Syntax Incorrect");
        }

        //Set implementation - holds unique values
        Set<Wombats> wombatSets = new HashSet<>();
        wombatSets.add(jude);
        wombatSets.add(avi);
        wombatSets.add(vlad);
        wombatSets.add(elvis);
        wombatSets.add(daddy);
        wombatSets.add(daddy);
        System.out.println(wombatSets);

        //Hashmap implementation
        Map<String, Wombats> fam = new HashMap<>();
        fam.put("Human", jude);
        fam.put("Alien", vlad);
        fam.put("Bonjour", avi);
        fam.put("Hello", daddy);
        fam.put("Priviet", elvis);

        System.out.println(fam);

        //LinkedLists
        LinkedLists linkedList = new LinkedLists();
        linkedList.append(jude);
        linkedList.append(avi);
        linkedList.prepend(vlad);
        linkedList.append(elvis);
        linkedList.prepend(daddy);

        System.out.println(linkedList);

        Graph bfs = new Graph(6);

        bfs.addEdge(0, 1);
        bfs.addEdge(1, 0);
        bfs.addEdge(0, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 1);
        bfs.addEdge(1, 3);
        bfs.addEdge(3, 1);
        bfs.addEdge(2, 4);
        bfs.addEdge(4, 2);
        bfs.addEdge(3, 4);
        bfs.addEdge(4, 3);

        bfs.BFS(2);

        System.out.println("*******************");
        bfs.addEdge(3, 5);

        //bfs.DFS(2);

        //bfs.dfs(2);

        System.out.println("Getting to heaps");

        //Heaps
        //Max Heap

        Heap heap = new Heap(6);
        heap.insert(3);
        heap.insert(10);
        heap.insert(12);
        heap.insert(8);
        heap.insert(2);
        heap.insert(14);
        System.out.println(heap);
        heap.delete(0);

        /*System.out.println(heap.getHeapSize());
        System.out.println(heap);
        System.out.println(heap.removeMax());*/
        System.out.println(heap);




    }
}