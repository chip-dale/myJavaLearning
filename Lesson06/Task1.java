/*
Fidan Ismailova

    Калькулятор с операциями *, +, -, /, %
Ввод х = 2 Вывод 2 + 3 = 5
     y = 3
     знак +
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\t{CALCULATOR}");

        double x = 0;
        double y = 0;
        char symbol = 0;
        String exit = "\t{Enter Operation >>  q  >> if you want EXIT}";
        while (symbol != 'q') {
            System.out.print("Enter First Number >> ");
            x = sc.nextInt();
            System.out.print("Enter Second Number >> ");
            y = sc.nextInt();
            System.out.print("Enter Operation >>\n\t+  -  *  /  % \t");
            symbol = sc.next().charAt(0);

            double result = 0;
            if (symbol == '+') {
                result = x + y;
                System.out.println("=>\n" + x + " + " + y + " = " + result);
                System.out.println(exit);
            } else if (symbol == '-') {
                result = x - y;
                System.out.println("=>\n" + x + " - " + y + " = " + result);
                System.out.println(exit);
            } else if (symbol == '*') {
                result = x * y;
                System.out.println("=>\n" + x + " * " + y + " = " + result);
                System.out.println(exit);
            } else if (symbol == '/') {
                result = x / y;
                System.out.println("=>\n" + x + " / " + y + " = " + result);
                System.out.println(exit);
            } else if (symbol == '%') {
                result = x % y;
                System.out.println("=>\n" + x + " % " + y + " = " + result);
                System.out.println(exit);
            }
        }
    }
}