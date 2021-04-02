/*
Определить интервал числа. (0, 10] (10, 100] (100, 1000]
Ввод
4
Вывод
0...10

Ввод 1001
Вывод
out of range
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER NUM:");
        int x = sc.nextInt();
        if(x <= 0){
            System.out.println("ZERO or NEGATIVE");
        } else if(x <= 10){
            System.out.println("0...10");
        } else if(x <= 100){
            System.out.println("10...100");
        } else if(x <= 1000){
            System.out.println("100...1000");
        }else{
            System.out.println("out of range");
        }
    }
}
