import java.util.*;

public class MergeSort {
    static void mergeSort(int arr[]) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        mergeSort(arr);

        System.out.println("Sorted Array:");
        for(int x : arr)
            System.out.print(x + " ");
    }
}