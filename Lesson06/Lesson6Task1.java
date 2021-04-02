/*
Fidan Ismailova
13.11.2020
14.11.2020

    Калькулятор с операциями *, +, -, /, %
Ввод х = 2 Вывод 2 + 3 = 5
     y = 3
     знак +
 */
import java.util.Scanner;

public class Lesson6Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULATOR >> VARIANT 1");
        System.out.print("Enter number A = ");
        int a1 = sc.nextInt();
        System.out.print("Enter number B = ");
        int b1 = sc.nextInt();  //TODO: b!=0
        System.out.println("Results:");
        System.out.println(a1 + " + " + b1 + " = " + (a1 + b1));
        System.out.println(a1 + " - " + b1 + " = " + (a1 - b1));
        System.out.println(a1 + " * " + b1 + " = " + (a1 * b1));
        System.out.println(a1 + " / " + b1 + " = " + (a1 / b1));  //TODO: возможно дробное
        System.out.println(a1 + " + " + b1 + "% = " + (a1 + 0.01 * a1 * b1));
        System.out.println(a1 + " - " + b1 + "% = " + (a1 - 0.01 * a1 * b1));

        System.out.println("\nCALCULATOR >> VARIANT 2");
        System.out.print("Enter number A = ");
        float a2 = sc.nextFloat();
        System.out.print("Enter number B = ");
        float b2 = sc.nextFloat();
        System.out.println("Results:");
        System.out.println(a2 + " + " + b2 + " = " + (a2 + b2));
        System.out.println(a2 + " - " + b2 + " = " + (a2 - b2));
        System.out.println(a2 + " * " + b2 + " = " + (a2 * b2));
        System.out.println(a2 + " / " + b2 + " = " + (a2 / b2));
        System.out.println(a2 + " + " + b2 + "% = " + (a2 + 0.01 * a2 * b2));
        System.out.println(a2 + " - " + b2 + "% = " + (a2 - 0.01 * a2 * b2));

        // TODO: не получается с вводом символа
        System.out.println("\nCALCULATOR >> VARIANT 3");
        System.out.print("Enter number X = ");
        int num1 = sc.nextInt();
        System.out.print("Enter number Y = ");
        int num2 = sc.nextInt();
        System.out.println("Enter one of the symbols:\t" +
                "+\t-\t*\t/\t%");
        //char symbol = sc.next().charAt(0);
        String symbol = sc.next();
        System.out.println("Results:");
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + (num1 + symbol + num2));
    }
}