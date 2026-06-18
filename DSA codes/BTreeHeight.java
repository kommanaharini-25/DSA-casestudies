import java.util.*;

public class BTreeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of files: ");
        int files = sc.nextInt();

        System.out.print("Enter order of B-Tree: ");
        int order = sc.nextInt();

        int height = 0;
        int capacity = 1;

        while(capacity < files) {
            capacity *= order;
            height++;
        }

        System.out.println("B-Tree Height = " + height);
    }
}