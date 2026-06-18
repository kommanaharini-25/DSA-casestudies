import java.util.*;

public class BFSExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer,List<Integer>> graph = new HashMap<>();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        for(int i=0;i<e;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.putIfAbsent(u,new ArrayList<>());
            graph.get(u).add(v);
        }

        System.out.print("Enter source node: ");
        int source = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(source);
        visited.add(source);

        System.out.println("BFS Traversal:");

        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for(int neighbor : graph.getOrDefault(node,new ArrayList<>())) {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
    }
}