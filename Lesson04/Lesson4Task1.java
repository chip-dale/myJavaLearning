import java.util.Scanner;
    /* Исмаилова Фидан */
public class Lesson4Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 593;
        //вариант1
        System.out.println("The number " + x + " consists of:");
        System.out.println((x / 100) + " >> hundreds");
        System.out.println((x / 10 % 10) + " >> tens");
        System.out.println((x % 10) + " >> units");
        //вариант2
        System.out.println("Запись с пробелами:");
        System.out.println(x + " => " + (x / 100) + "\n\s\s\s\s\s\s\s" + (x / 10 % 10) + "\n\s\s\s\s\s\s\s" + (x % 10));
        System.out.println("Запись с табуляциями:");
        System.out.println(x + "\t=>\t" + (x / 100) + "\n\t\t" + (x / 10 % 10) + "\n\t\t" + (x % 10));
        //вариант3 >> с вводом числа
        System.out.println("Please enter three-digit number >> ");
        int y = sc.nextInt();   //TODO: ???КАК СДЕЛАТЬ ЧИСЛО СТРОГО ТРЕХЗНАЧНЫМ??? :-(
        System.out.println("Thanks!");
        System.out.println(y + "\t=>\n\t" + (y / 100) + " (hundreds)\n\t" + (y / 10 % 10) + " (tens)\n\t" + (y % 10) + " (units)");
    }
}
