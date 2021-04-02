import java.util.Scanner;
    /* Исмаилова Фидан */
public class Lesson4Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Please enter number A >> ");
        a = sc.nextInt();
        System.out.println("Please enter number B >> ");
        b = sc.nextInt();
        System.out.println("RESULTS >> ");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println("\tVariant #1");
        System.out.println(a + " += " + b + " => " + (a + b));
        System.out.println(a + " -= " + b + " => " + (a - b));
        System.out.println(a + " *= " + b + " => " + (a * b));
        System.out.println(a + " /= " + b + " => " + (a / b));
        System.out.println(a + " %= " + b + " => " + (a % b));
        System.out.println("++" + a + " => " + (a + 1));
        System.out.println("++" + b + " => " + (b + 1));
        System.out.println("--" + a + " => " + (a - 1));
        System.out.println("--" + b + " => " + (b - 1));
        System.out.println("\tVariant #2");   // с использованием операторов присвоения, при которых значение уже меняется
        System.out.println(a + " += " + b + " => " + (a += b));
        System.out.println(a + " -= " + b + " => " + (a -= b));
        System.out.println(a + " *= " + b + " => " + (a *= b));
        System.out.println(a + " /= " + b + " => " + (a /= b));
        System.out.println(a + " %= " + b + " => " + (a %= b));
        System.out.println("++A => ++" + a + " => " + (++a));
        System.out.println("++B => ++" + b + " => " + (++b));
        System.out.println("--A => --" + a + " => " + (--a));
        System.out.println("--B => --" + b + " => " + (--b));
    }
}
