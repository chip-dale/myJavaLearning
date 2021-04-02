import java.util.Scanner;
/*
Показать на экране все совершенные числа в диапазоне от 0 до n.
Примеры:
1-е совершенное число: 6 имеет следующие собственные
делители – 1, 2, 3; их сумма равна 6.
2-е совершенное число: 28 имеет следующие собственные
делители: – 1, 2, 4, 7, 14; их сумма равна 28.
 */
public class Task4 {
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

        int num;
        int j = 0;
        System.out.println("Perfect Numbers:\t...");
        for (num = 1; num <= n; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print((++j) + "-е совершенное число: " + num);
                System.out.print(" имеет следующие собственные делители – ");
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.print(i + ", ");
                    }
                }
                System.out.println("\b\b; их сумма равна " + sum + ".");
            }
        }
    }
}
