/*
Найти минимальный и максимальный элемент в массиве из n элементов.
 */
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter array counter:\t");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i;

        for (i = 0; i < n; i++) {
            System.out.print("\tPlease enter array number:\t");
            arr[i] = sc.nextInt();
        }

        System.out.print("ARRAY:\t{");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b}");

        System.out.print("FIND MAX:\t");
        int max = arr[0];
        for (i = 0; i < n; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.print("FIND MIN:\t");
        int min = arr[0];
        for (i = 0; i < n; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
