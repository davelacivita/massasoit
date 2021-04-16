import java.util.Scanner;

public class RecursiveReverse_RMM {
    public static int[] reverse(int[] a, int lo, int hi) {
        if (lo < hi) {
            // Swapping first and last element
            int temp = a[lo];
            a[lo] = a[hi];
            a[hi] = temp;
            // recursive call
            reverse(a, lo + 1, hi - 1);
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter Array size:");
        // Reading array size
        n = scan.nextInt();
        // defineing array with array size
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        // Reading array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        // calling reverse function
        int[] output = reverse(arr, 0, n - 1);
        System.out.println("Array after reverse");
        // Printing array elements
        for (int i : output)
            System.out.print(i + " ");
    }
}