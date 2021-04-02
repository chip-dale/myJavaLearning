import java.util.Scanner;

/**
 * Создать переставить элементы массива.
 * Например: 1 2 3 переставить в 3 2 1
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ARRAY NUM:\t");
        int n = sc.nextInt();

        Queue arr = new Queue(n);

        for (int i = 1; i <= n; i++) {
            arr.push(i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr.pop(i) + " ");
        }

        System.out.print("=>");

        for (int i = 1; i <= n; i++) {
            arr.push(i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + arr.pop());
        }

        System.out.println();
    }
}
