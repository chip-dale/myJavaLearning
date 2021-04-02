import java.util.Scanner;
/*
Показать на экране все числа Фибоначчи в диапазоне от 0 до n.
 */
public class Task1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter num:\t");
        int n = sc.nextInt();
        int n1 = 0;
        while (n <= n1) {
            System.out.print("\tA very small number!\nPlease try again:\t");
            n = sc.nextInt();
        }
        System.out.println("\nYour range of numbers:\t[" + n1 +", " + n + "]\n");

        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print("Fibonacci Numbers:\t" + a + ", ");
        while (c <= n) {
            System.out.print(b + ", " + c + ", ");
            a += b;
            b += c;
            c = a + b;
        }
        if (b <= n) {
            System.out.println(b);
        } else {
            System.out.println("\b\b");
        }
    }
}
