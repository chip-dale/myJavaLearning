/*
Определить является ли массив из n элементов палиндромом (первая половина зеркальна относительно второй)
3, 4, 5, 4 ,3 => yes
7, 6, 6, 7 => yes
7, 3, 6, 3 => no
 */
import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array count:\t");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            System.out.print("\tEnter num:\t");
            arr[i] = sc.nextInt();
        }

        System.out.print("ARRAY palindrome:\t{");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b}");

        int j;
        boolean result;
        for (i = 0, j = n - 1; i < n/2; i++, j--) {
            if (arr[i] == arr[j]) {
                result = true;
                System.out.println(" => yes");
                break;
            } else {
                result = false;
                System.out.println(" => no");
                break;
            }
        }
    }
}
