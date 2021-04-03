import java.util.Scanner;
/*
Показать на экране все числа Армстронга в диапазоне от 10 до n.
Например:
153 = 1 в степени 3 + 5 в степени 3 + 3 в степени 3
 */
public class Armstrong {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter num:\t");
        int n = sc.nextInt();
        int n1 = 10;
        while (n <= n1) {
            System.out.print("\tA very small number!\nPlease try again:\t");
            n = sc.nextInt();
        }
        System.out.println("\nYour range of numbers:\t[" + n1 +", " + n + "]\n");

        int a;
        System.out.println("Armstrong Numbers:\t...");
        for (a = n1; a <= n; a++) {
            int count = 0;
            for (int temp = a; temp != 0; temp /= 10) {
                count++;
            }
            int sum = 0;
            for (int temp = a; temp != 0; temp /= 10) {
                int mod = temp % 10;
                int pow = 1;
                for (int x = 1; x <= count; x++) {
                    pow *= mod;
                }
                sum += pow;
            }

            int[] arr = new int[count];
            int i, j;
            int z = a;
            if (a == sum) {
                for (i = 0; i < count; i++) {
                    arr[i] = z % 10;
                    z = z / 10;
                }
                System.out.print(a + " = ");
                for (i = 0, j = count - 1; j >= i; j--) {
                    System.out.print(arr[j] + " в степени "  + count + " + ");
                }
                System.out.println("\b\b\b");
            }
        }
    }
}
