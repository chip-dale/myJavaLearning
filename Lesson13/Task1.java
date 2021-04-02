import java.util.Scanner;
/**
 * В классе Math из предыдущего дз (Lesson10) добавить методы деления, сложения, вычитания и умножения
 * для трех переменных (использовать перегрузку)
 */
public class Task1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUM\ta >> ");
        double a = sc.nextDouble();

        System.out.print("ENTER NUM\tb >> ");
        double b = sc.nextDouble();

        System.out.print("ENTER NUM\tc >> ");
        double c = sc.nextDouble();

        Math oop = new Math();

        double sum = oop.getSum(a,b);
        System.out.println("сложение для двух переменных:\ta + b = " + sum);
        sum = oop.getSum(a,b,c);
        System.out.println("сложение для трех переменных:\ta + b + c = " + sum);

        double difference = oop.getDifference(a,b);
        System.out.println("вычитание для двух переменных:\ta + b = " + difference);
        difference = oop.getDifference(a,b,c);
        System.out.println("вычитание для трех переменных:\ta + b + c = " + difference);

        double multiplication = oop.getMultiplication(a,b);
        System.out.println("умножение для двух переменных:\ta + b = " + multiplication);
        multiplication = oop.getMultiplication(a,b,c);
        System.out.println("умножение для трех переменных:\ta + b + c = " + multiplication);

        double division = oop.getDivision(a,b);
        System.out.println("деление для двух переменных:\ta + b = " + division);
        division = oop.getDivision(a,b,c);
        System.out.println("деление для трех переменных:\ta + b + c = " + division);

        long power = oop.getPower(a,b);
        System.out.println("a\tв степени\tb:\t" + power);
        power = oop.getPower(b,c);
        System.out.println("b\tв степени\tc:\t" + power);
        power = oop.getPower(a,c);
        System.out.println("a\tв степени\tc:\t" + power);
        power = oop.getPower(b,a);
        System.out.println("b\tв степени\ta:\t" + power);
        power = oop.getPower(c,a);
        System.out.println("c\tв степени\ta:\t" + power);
        power = oop.getPower(c,b);
        System.out.println("c\tв степени\tb:\t" + power);
    }
}

class Math {
    double getSum(double a, double b) {
        return a + b;
    }
    double getSum(double a, double b, double c) {
        return a + b + c;
    }
    double getDifference(double a, double b) {
        return a - b;
    }
    double getDifference(double a, double b, double c) {
        return a - b - c;
    }
    double getMultiplication(double a, double b) {
        return a * b;
    }
    double getMultiplication(double a, double b, double c) {
        return a * b * c;
    }
    double getDivision(double a, double b) {
        return a / b;
    }
    double getDivision(double a, double b, double c) {
        return a / b / c;
    }
    long getPower(double a, double b) {
        long pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }
}
