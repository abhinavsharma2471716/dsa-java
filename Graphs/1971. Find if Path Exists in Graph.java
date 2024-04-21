Approach : 1 ( DFS )

import java.util.*;

class Solution {
    
    public boolean check(Map<Integer, List<Integer>> mp, int node, int dest, boolean[] visited) {
        if (node == dest)
            return true;
       
        if (visited[node])
            return false;
        
        visited[node] = true;
        for (int it : mp.getOrDefault(node, new ArrayList<>())) {
            
            if (!visited[it] && check(mp, it, dest, visited))
                return true;
        }
        return false;
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination)
            return true;
        
        Map<Integer, List<Integer>> mp = new HashMap<>();
        
        for (int[] vec : edges) {
            int u = vec[0];
            int v = vec[1];
            
            mp.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            mp.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        boolean[] visited = new boolean[n];
        return check(mp, source, destination, visited);
    }
}

Approach : 2 ( BFS )

import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int[] vec : edges) {
            int u = vec[0];
            int v = vec[1];
            mp.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            mp.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        boolean[] visited = new boolean[n];
        Queue<Integer> que = new LinkedList<>();
        que.offer(source);
        visited[source] = true;
        
        while (!que.isEmpty()) {
            int node = que.poll();
            if (node == destination)
                return true;
            for (int it : mp.getOrDefault(node, new ArrayList<>())) {
                if (!visited[it]) {
                    visited[it] = true;
                    que.offer(it);
                }
            }
        }
        
        return false;
    }
}

Approach : 3 (Union find Data Structure)

class Solution {
    private int[] parent;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Step 1: Initialize parent array
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // Each vertex is its own parent initially
        }
        // Step 2: Merge sets based on edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            union(u, v);
        }
        // Step 3: Check if source and destination belong to the same set
        return find(source) == find(destination);
    }
    // Find operation to find the root parent of a vertex
    private int find(int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent[vertex]); // Path compression
        }
        return parent[vertex];
    }
    // Union operation to merge two sets
    private void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        if (rootU != rootV) {
            parent[rootU] = rootV;
        }
    }
}
