/*
Переставить числа.
a = 2 => a = 5
b = 3    b = 2
c = 4    c = 3
d = 5    d = 4
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        System.out.println("a = " + a + " =>");
        System.out.println("b = " + b + " =>");
        System.out.println("c = " + c + " =>");
        System.out.println("d = " + d + " =>");
        int x = d;
        d = c;
        c = b;
        b = a;
        a = x;
        System.out.println("\t=> a = " + a);
        System.out.println("\t=> b = " + b);
        System.out.println("\t=> c = " + c);
        System.out.println("\t=> d = " + d);

//        System.out.println("VARIANT 1:");
//        int a, b, c, d;
//        a = 2;
//        b = 3;
//        c = 4;
//        d = 5;
//        System.out.println("a = " + a + " => a = " + (a = d));
//        a = 2;
//        System.out.println("b = " + b + " => b = " + (b = a));
//        b = 3;
//        System.out.println("c = " + c + " => c = " + (c = b));
//        c = 4;
//        System.out.println("d = " + d + " => d = " + (d = c));
//
//        System.out.println("\nVARIANT 2:");
//        int[] num = {2, 3, 4, 5};
//        System.out.println("a = " + num[0] + " => a = " + num[3]);
//        System.out.println("b = " + num[1] + " => b = " + num[0]);
//        System.out.println("c = " + num[2] + " => c = " + num[1]);
//        System.out.println("d = " + num[3] + " => d = " + num[2]);
//
//        System.out.println("\nVARIANT 3:");
//        int a1, b1, c1, d1;
//        a1 = 2;
//        b1 = 3;
//        c1 = 4;
//        d1 = 5;
//        System.out.println("a = " + a1 + " => a = " + (a1 += 3));
//        System.out.println("b = " + b1 + " => b = " + (b1 -= 1));
//        System.out.println("c = " + c1 + " => c = " + (c1 -= 1));
//        System.out.println("d = " + d1 + " => d = " + (d1 -= 1));
//
//        System.out.println("\nVARIANT 4:");
//        int a2, b2, c2, d2;
//        a2 = 1;
//        b2 = ++a2;
//        c2 = ++b2;
//        d2 = ++c2;
//        d2++;
//        System.out.println("a = " + a2 + " => a = " + (a2 = d2));
//        System.out.println("b = " + b2 + " => b = " + (--b2));
//        System.out.println("c = " + c2 + " => c = " + (--c2));
//        System.out.println("d = " + d2 + " => d = " + (--d2));
//
//        System.out.println("\nVARIANT 5:");
//        Scanner sc = new Scanner(System.in);
//        int a3, b3, c3, d3;
//        System.out.println("PLEASE ENTER NUMBER:");
//        a3 = sc.nextInt();
//        b3 = ++a3;
//        c3 = ++b3;
//        d3 = ++c3;
//        d3++;
//        System.out.println("a = " + a3 + " => a = " + (a3 = d3));
//        System.out.println("b = " + b3 + " => b = " + (--b3));
//        System.out.println("c = " + c3 + " => c = " + (--c3));
//        System.out.println("d = " + d3 + " => d = " + (--d3));
    }
}
