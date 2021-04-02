/*
Fidan Ismailova
14.11.2020

    Высчитать кол-во цифр в числе любой длины(использовать цикл while)
Ввод 1234 Вывод 4
     123        3
     34         2
     7          1
 */
import java.util.Scanner;

public class Lesson6Task5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long num = sc.nextLong();
        int count = (num == 0) ? 1 : 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("Number count: " + count);
    }
}
