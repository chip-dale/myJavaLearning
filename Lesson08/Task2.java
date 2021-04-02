import java.util.Scanner;
/*
Написать программу, которая выводит на экран все простые числа в диапазоне от 2 до n.
 */
public class Task2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter num:\t");
        int n = sc.nextInt();
        int n1 = 2;
        while (n <= n1) {
            System.out.print("\tA very small number!\nPlease try again:\t");
            n = sc.nextInt();
        }
        System.out.println("\nYour range of numbers:\t[" + n1 +", " + n + "]\n");

        int num;
        System.out.print("Prime Numbers:\t");
        for (num = n1; num <= n; num++) {
            int temp;
            boolean isPrime = true;
            for (int i = n1; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(num + ", ");
            }
        }
        System.out.println("\b\b");
    }
}
