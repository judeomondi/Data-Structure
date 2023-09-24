package DataStructuresImplementation;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    private int weight;

    public Graph (int v){
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }
    public void BFS (int start){

        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited [start] = true;
        queue.add(start);

        while (queue.size() != 0 ) {
            start = queue.poll();

            System.out.println(start + " ");

            for (int next : adj[start]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }

            }

        }

    }

    public void DFSUtil (int start, boolean[] visited) {

        visited [start] = true;

        System.out.println(start + " ");

        for (int next : adj[start]) {
            if (!visited[next]) {
                visited[next] = true;
                DFSUtil(next, visited);
            }

        }


    }

    public void DFS(int start){
        boolean[] visited = new boolean[V];

        DFSUtil(start, visited);
    }

    public void dfs(int start){
        Stack<Integer> stack = new Stack();
        boolean[] visited = new boolean[adj.length];

        stack.push(start);
        while (!stack.empty()) {
            int current  = stack.peek();
            System.out.println(current + " ");
            while (!visited[current]) {
                visited[current] = true;
                for (int dest : adj[current]){
                    if(!visited[dest]){
                        stack.push(dest);
                    }
                }
            }
        }

    }

}
