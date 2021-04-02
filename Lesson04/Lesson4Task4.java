import java.util.Scanner;
    /* Исмаилова Фидан */
public class Lesson4Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1, i2, i3, i4, i5;
        System.out.println("Please enter Variable Num 1 >> ");
        i1 = sc.nextInt();
        System.out.println("Please enter Variable Num 2 >> ");
        i2 = sc.nextInt();
        System.out.println("Please enter Variable Num 3 >> ");
        i3 = sc.nextInt();
        System.out.println("Please enter Variable Num 4 >> ");
        i4 = sc.nextInt();
        System.out.println("Please enter Variable Num 5 >> ");
        i5 = sc.nextInt();
        int[] num = {i1, i2, i3, i4, i5};
        System.out.println("Thanks!\nYour ARRAY is:\n{" + num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4] + "}");

        i1 %= 2;
        i2 %= 2;
        i3 %= 2;
        i4 %= 2;
        i5 %= 2;
        int sum = 5 - (i1 + i2 + i3 + i4 + i5);
        System.out.println("Amount of even numbers is: " + sum);
    }
}
