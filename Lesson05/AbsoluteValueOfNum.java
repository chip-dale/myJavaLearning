/*
Вывести модуль числа
5 => 5
-6 => 6
 */
import java.util.Scanner;

public class AbsoluteValueOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER NUMBER:");
        int x = sc.nextInt();

        System.out.println("VARIANT #1 >> if...else");
        System.out.print(x + " => ");
        if (x < 0) {
            System.out.println(-x);
        } else {
            System.out.println(x);
        }
        System.out.print((-x) + " => ");
        if (x < 0) {
            System.out.println(-x);
        } else {
            System.out.println(x);
        }

        System.out.println("VARIANT #2 >> Math.abs");
        System.out.println(x + " => " + Math.abs(x));
        System.out.println(-x + " => " + Math.abs(-x));
    }
}
