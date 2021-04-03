/*
Fidan Ismailova
13.11.2020

    Найти среднее арифметическое элементов массива
Пример 1 3 7 2
Вывод 3.25
 */
import java.util.Scanner;

public class AverageOfArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER ARRAY QUANTITY:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i = 0;
        while (i < n){
            System.out.println("PLEASE ENTER ARRAY NUM:");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("ARRAY:\n\t{");
        i = 0;
        while (i < n){
            System.out.print(arr[i] + ", ");
            i++;
        }
        System.out.println("\b\b}");

        System.out.print("AVERAGE:\n\t");
        float sum = 0;
        i = 0;
        while (i < n){
            sum += arr[i];
            i++;
        }
        System.out.println(sum / n);
    }
}
