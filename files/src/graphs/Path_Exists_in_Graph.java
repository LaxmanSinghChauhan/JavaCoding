package graphs;

import java.util.*;

public class Path_Exists_in_Graph {
    public static void main(String[] args) {
        //https://leetcode.com/explore/learn/card/graph/619/depth-first-search-in-graph/4151/
        System.out.println("*******************************************************");
        System.out.println("LeetCode 1971 - Find if Path Exists in Graph - DFS");
        System.out.println("*******************************************************");

//        // Creating a graph with 5 vertices
//        int V = 5;
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
//
//        for (int i = 0; i < V; i++)
//            adj.add(new ArrayList<Integer>());
//
//        // Adding edges one by one
//        addEdge(adj, 0, 1);
//        addEdge(adj, 0, 4);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);
//
//        printGraph(adj);
        int vertexcount =6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int start = 0;
        int end = 5;
       Boolean doPathExist = validPath(vertexcount, edges, start, end);
        System.out.println("path exists: "+doPathExist);
    }

    // A utility function to add an edge in an
    // undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("Vertex " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adjacency_list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacency_list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjacency_list.get(edge[0]).add(edge[1]);
            adjacency_list.get(edge[1]).add(edge[0]);
        }

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start);
        boolean[] seen = new boolean[n];
        Arrays.fill(seen, false);

        while (!stack.isEmpty()) {
            // Get the current node.
            int node = stack.pop();

            // Check if we have reached the target node.
            if (node == end) {
                return true;
            }

            // Check if we've already visited this node.
            if (seen[node]) {
                continue;
            }
            seen[node] = true;

            // Add all neighbors to the stack.
            for (int neighbor : adjacency_list.get(node)) {
                stack.push(neighbor);
            }
        }

        return false;
    }
}