package graphs;

import java.util.Arrays;
import java.util.Scanner;

public class Adj_matrix {
    public static void main(String[] args) {
        int n;
        int e;
        Scanner s = new Scanner(System.in);
        //        n= s.nextInt();
        //        e= s.nextInt();
        //        int edges[][]= new int[n][n];
        //        for(int i =0;i<e;i++)
        //        {
        //            int fv = s.nextInt();
        //            int sv = s.nextInt();
        //            edges[fv][sv]=1;
        //            edges[sv][fv]=1
        //        }

        // hardcoded input
        int[][] edges = new int[4][4];
        edges[0][1] = 1;
        edges[1][0] = 1;
        edges[0][2] = 1;
        edges[2][0] = 1;
        edges[1][3] = 1;
        edges[3][1] = 1;
        edges[2][3] = 1;
        edges[3][2] = 1;
        edges[2][1] = 1;
        edges[1][2] = 1;
        Boolean[] visited = new Boolean[4];
        Arrays.fill(visited, Boolean.FALSE);
        printHelper(edges, 0, edges.length, visited);
    }

    public static void printHelper(int[][] edges, int s, int vc, Boolean[] visited) {
        //fill the visited vertex
        visited[s] = true;
        System.out.print("->" + s);
        //end condition- here once I reach the end of a row I should return
        for (int i = 0; i < vc; i++) {
            if (edges[s][i] == 1 && !visited[i]) {
                printHelper(edges, i, vc, visited);
            }
        }
    }
}
