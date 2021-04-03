/*
Определить, является ли число счастливым (сумма цифр первой половины равна сумме цифр второй половины).
 Число состоит из n цифр. n кратно двум.
 Пример:  5647 => 5+6 == 4 + 7 соостветсвенно число счастливое
 */
import java.util.Scanner;

public class HappyNum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER:\t");
        int number = sc.nextInt();
        int num = number;

        int count = (num == 0) ? 1 : 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        //TODO: count kratniy 2 >> kod nekorrektniy
//        if (count % 2 != 0) {
//            System.out.println("\tSorry, this number is not multiple of two!\t");
//            System.out.print("PLEASE TRY AGAIN:\t");
//            number = sc.nextInt();
//        } else {
//            System.out.println("OK");
//        }


        int[] arr = new int[count];
        int i, j1, j2, sum1, sum2;
        System.out.print(number);
        for (i = 0; i < count; i++) {
            arr[i] = number % 10;
            number = number / 10;
        }
        System.out.print(" => ");
        for (sum1 = 0, j1 = count - 1; j1 >= count/2; j1--) {
            System.out.print(arr[j1] + " + ");
            sum1 += arr[j1];
        }
        System.out.print("\b\b== ");
        for (sum2 = 0, j2 = count/2 - 1; j2 >= 0; j2--) {
            System.out.print(arr[j2] + " + ");
            sum2 += arr[j2];
        }
        System.out.println("\b\b\b");

        boolean result = true;
        if (sum1 == sum2) {
            System.out.println("\t" + result + " :-) NUMBER IS HAPPY");
        } else {
            result = false;
            System.out.println("\t" + result + " :-( NUMBER IS NOT HAPPY");
        }
    }
}
