import java.util.Scanner;
/*
С клавиатуры вводится целое положительное число любой разрядности. Необходимо перевернуть это число, т.е.
цифры должны располагаться в обратном порядке (например, вводим число 1234 – в результате будет 4321).
Не использовать строки и массивы.
 */
public class Task2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPLEASE ENTER NUM = ");
        int n = sc.nextInt();
        int num = n;
        int count = (num == 0) ? 1 : 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        //System.out.println(count);

        System.out.print("\n\tREVERSE NUM = ");
        for(int i = 0; i < count; i++) {
            int temp = n;
            temp %= 10;
            System.out.print(temp);
            n /= 10;
        }
        System.out.println();
    }
}
