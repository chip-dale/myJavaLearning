/*
Fidan Ismailova
13.11.2020

    Посчитать кол-во четных и нечетных элементов
Пример 4 5 1 6 8 7 9
Вывод Четных 3
      Нечетных 4
 */
import java.util.Scanner;

public class Lesson6Task4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER ARRAY QUANTITY:");
        int num = sc.nextInt();

        int arr[] = new int[num];

        int i = 0;
        while (i < num) {
            System.out.println("PLEASE ENTER NUM:");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("ARRAY:\t{");
        i = 0;
        while (i < num) {
            System.out.print(arr[i] + ", ");
            i++;
        }
        System.out.println("\b\b}");

        int sumMod = 0;
        i = 0;
        while (i < num) {
            sumMod += arr[i] % 2;
            i++;
        }
        System.out.println("even:\t" + (num - sumMod));
        System.out.println("odd:\t" + sumMod);
    }
}