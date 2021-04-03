/*
Определить четное число. Ввод число. Вывод odd или even.
 */
import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER NUMBER:");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("this number is ZERO");
        } else if(n % 2 == 0){
            System.out.println("this number is even");
        } else{
            System.out.println("this number is odd");
        }
    }
}
