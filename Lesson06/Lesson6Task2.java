/*
Fidan Ismailova
13.11.2020

    Вывести четные индексы массива
Пример 1 4 6 9 7
Вывод 1 6 7
 */
import java.util.Scanner;

public class Lesson6Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER ARRAY QUANTITY:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i = 0;
        while (i < n){
            System.out.println("PLEASE ENTER ARRAY NUMBER:");
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

        System.out.print("ARRAY INDEXES:\n\t{");
        i = 0;
        while (i < n){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("\b\b}");

        System.out.println("EVEN ARRAY INDEXES:");
        i = 0;
        System.out.print("\t{");
        while (i < n){
            int j = i % 2;
            if(j == 0){
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println("\b\b}");

        System.out.println("NUMBERS FROM EVEN ARRAY INDEXES:");
        i = 0;
        System.out.print("\t{");
        while (i < n){
            int j = i % 2;
            if(j == 0){
                System.out.print(arr[i] + ", ");
            }
            i++;
        }
        System.out.println("\b\b}");
    }
}