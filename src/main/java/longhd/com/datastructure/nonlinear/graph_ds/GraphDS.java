package longhd.com.datastructure.nonlinear.graph_ds;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Graph basically it is a group of edges and vertices.
 * Graph representation: G(V,E) -> where V(G) represents a set of vertices and E(G) represents a set of edges.
 * The graph can be directed or undirected, and it also can be connected or disjoint.
 * Advantages:
 *      + flexible and powerful when it comes to finding connections and identifying the shortest path
 * Disadvantages:
 *      + Storing graph(Adjacency list and Adjacency matrix) can lead to complexities.
 */
public class GraphDS {

    public static class Graph<T> {

        /**
         * Using HashMap to store vertex and edges in the graph.
         */
        private Map<T, List<T>> map = new HashMap<>();

        /**
         * This function to adds a new vertex to the graph.
         */
        public void addVertex(T s) {
            map.put(s, new LinkedList<T>());
        }

        /**
         * This function to adds the edge between source and destination.
         */
        public void addEdge(T source, T destination, boolean bidirectional) {
            if (!map.containsKey(source)) {
                addVertex(source);
            }
            if (!map.containsKey(destination)) {
                addVertex(destination);
            }
            map.get(source).add(destination);
            if (bidirectional) {
                map.get(destination).add(source);
            }
        }

        /**
         * This function return the count of Vertex.
         */
        public int getTotalVertex() {
            return map.keySet().size();
        }

        /**
         * This function return the count of edges
         */
        public int getTotalEdges(boolean bidirectional) {
            int count = 0;
            for (T v : map.keySet()) {
                count += map.get(v).size();
            }
            if (bidirectional) {
                count = count/2;
            }
            return count;
        }

        /**
         * This function check vertex is present or not
         */
        public boolean hasVertex(T s) {
            return map.containsKey(s);
        }

        /**
         * This function check edge is present or not.
         */
        public boolean hasEdge(T s, T d) {
            return map.get(s).contains(d);
        }

        /**
         * Prints the adjacency list of each vertex.
         */
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (T v : map.keySet()) {
                builder.append(v.toString() + ": ");
                for (T e : map.get(v)) {
                    builder.append(e.toString() + " ");
                }
                builder.append("\n");
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();

        graph.addEdge(0, 1, true);
        graph.addEdge(0, 2, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(1, 3, true);
        graph.addEdge(2, 4, true);
        graph.addEdge(2, 5, true);

        System.out.println(graph);
        System.out.println("Total vertex: " + graph.getTotalVertex());
        System.out.println("Total Edge: " + graph.getTotalEdges(true));
        System.out.println("Has vertex 1: " + graph.hasVertex(1));
        System.out.println("Has edge 3-4: " + graph.hasEdge(3, 4));
    }
}
