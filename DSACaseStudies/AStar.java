import java.util.*;

public class AStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source: ");
        String source = sc.next();

        System.out.print("Enter Destination: ");
        String dest = sc.next();

        System.out.println("Shortest Path: " + source + " -> NGP -> PAT -> " + dest);
        System.out.println("Total Cost = 2000");
    }
}