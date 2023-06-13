/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BellmanFordAlgorithm;

/**
 *
 * @author admin
 */
import java.util.*;

public class BellmanFordAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static void bellmanFord(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distance = new int[vertices];

        Arrays.fill(distance, INF);
        distance[source] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            for (int u = 0; u < vertices; u++) {
                for (int v = 0; v < vertices; v++) {
                    if (graph[u][v] != 0 && distance[u] != INF &&
                            distance[u] + graph[u][v] < distance[v]) {
                        distance[v] = distance[u] + graph[u][v];
                    }
                }
            }
        }

        // Kiểm tra xem có chu trình âm hay không
        for (int u = 0; u < vertices; u++) {
            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && distance[u] != INF &&
                        distance[u] + graph[u][v] < distance[v]) {
                    System.out.println("Đồ thị chứa chu trình âm");
                    return;
                }
            }
        }

        printSolution(distance);
    }

    private static void printSolution(int[] distance) {
        System.out.println("Đỉnh \t Khoảng cách từ nguồn");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t\t " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        bellmanFord(graph, 0);
    }
}
