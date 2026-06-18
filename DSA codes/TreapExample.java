import java.util.*;

class TreapNode {
    char key;
    int priority;
    TreapNode left, right;

    TreapNode(char key, int priority) {
        this.key = key;
        this.priority = priority;
    }
}

public class TreapExample {
    static TreapNode insert(TreapNode root, char key, int priority) {
        if(root == null)
            return new TreapNode(key, priority);

        if(key < root.key)
            root.left = insert(root.left, key, priority);
        else
            root.right = insert(root.right, key, priority);

        return root;
    }

    static void inorder(TreapNode root) {
        if(root != null) {
            inorder(root.left);
            System.out.println("Key: " + root.key + " Priority: " + root.priority);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreapNode root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            System.out.print("Enter Key: ");
            char key = sc.next().charAt(0);

            System.out.print("Enter Priority: ");
            int p = sc.nextInt();

            root = insert(root,key,p);
        }

        System.out.println("Treap Inorder:");
        inorder(root);
    }
}