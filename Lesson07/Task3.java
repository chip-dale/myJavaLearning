/*
Записать цифры n-значного числа в массив.
Пример: 123 => массив из 3 элементов 1,2,3
 */
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\tENTER NUMBER:\t");
        int number = sc.nextInt();  //число
        int num = number;

        int count = (num == 0) ? 1 : 0;  //переменная количества элементов в числе
        while (num != 0) {
            count++;
            num /= 10;
        }

        int[] arr = new int[count];
        int i, j;
        System.out.print(number);
        for (i = 0; i < count; i++) {   //цикл выводит массив элементов числа в обратном порядке
            arr[i] = number % 10;
            number = number / 10;
            //System.out.println(arr[i] + " ");
        }
        System.out.print(" => массив из " + count + " элементов {");
        for (i = 0, j = count - 1; j >= i; j--) {   //цикл обратного массива от предыдущего цикла
            System.out.print(arr[j] + ", ");
        }
        System.out.println("\b\b}");

        System.out.println("\tFINISH!");
    }
}
