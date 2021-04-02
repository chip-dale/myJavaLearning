import java.util.Scanner;

/*
    Вывести прямоугольник длины m и ширины n. Значения вводятся с клавиатуры.
    m = 4 n = 3
    ****
    *  *
    ****
*/
public class Task3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("PLEASE ENTER LENGTH:\t");
        int m = sc.nextInt();

        System.out.print("PLEASE ENTER HEIGHT:\t");
        int n = sc.nextInt();

        int i, j;

        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == m - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
