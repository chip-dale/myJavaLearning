import java.util.Scanner;

/**
 * Дан введите число n. Заполните с клавиатуры двумерный массив n на n. Выведите массив в виде матрицы.
 *  Напечатайте элементы по часовой стрелке по спирали начиниая с элемента 0 0.
 *  1 2 3
 *  4 5 6
 *  7 8 9
 *
 *  1 2 3 6 9 8 7 4 5
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\ttwo-dimensional array");
        System.out.print("ENTER NUM:\t");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int i, j;
        System.out.println();
        for (i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print("Please enter array number:\t");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nARRAY:");
        for (i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\b");
        }

        System.out.println("\nELEMENTS in CLOCKWISE SPIRAL:");
        i = 0;
        j = 0;
        int num = n;
        for(int k = 0; n > k; k++, n--) {
            if(num % 2 == 1) {
                while (j < n) {
                    System.out.print(arr[i][j] + "\t");
                    j++;
                }
                i++;
                j--;
                while(i < n) {
                    System.out.print(arr[i][j] + "\t");
                    i++;
                }
                i--;
                j--;
            } else {
                while (j < n-1) {
                    System.out.print(arr[i][j] + "\t");
                    j++;
                }
                while(i < n-1) {
                    System.out.print(arr[i][j] + "\t");
                    i++;
                }
            }
            while(j > k) {
                System.out.print(arr[i][j] + "\t");
                j--;
            }
            while(i > k) {
                System.out.print(arr[i][j] + "\t");
                i--;
            }
            i++;
            j++;
        }
        System.out.println("\b");
    }
}
