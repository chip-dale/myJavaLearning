/*
Напечатать массив в обратном порядке.
 */
import java.util.Scanner;

public class ReverseArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array count:\t");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            System.out.print("\tEnter array num:\t");
            arr[i] = sc.nextInt();
        }

        int j;
        System.out.print("ARRAY (reverse):\t{");
        for (i = 0, j = n - 1; j >= i; j--) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println("\b\b}");
    }
}
