import java.util.Scanner;
/**
 * Создать класс с методом binarySearch с использованием рекурсии
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ARRAY COUNT:\t");
        Array array = new Array(sc.nextInt());
        array.fill();
        array.print();

        System.out.println("\nSORTING ARRAY ELEMENTS USING BUBBLE SORT:\t");
        array.bubbleSort(array.arr);
        array.print();

        System.out.print("\nENTER ELEMENT TO BINARY SEARCH:\t");
        array.binarySearch(array.arr, 0, (array.count - 1), sc.nextInt());
    }
}

class Array{
    Scanner sc = new Scanner(System.in);

    int[] arr;
    int count;

    Array(int n) {
        count = n;
        arr = new int[count];
    }
    void fill() {
        for(int i = 0; i < count; i++) {
            System.out.print("\tENTER ARRAY NUM:\t");
            arr[i] = sc.nextInt();
        }
    }
    void print() {
        System.out.print("ARRAY:\t{");
        for(int i = 0; i < count; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b}");
    }
    void binarySearch(int[] arr, int i, int j, int el) {
        int mid = 1;
        if(j >= i) {
            mid = i + (j - i) / 2;
            if (arr[mid] == el) {
                System.out.println("\tindex = " + mid);
                return;
            } else if (arr[mid] > el) {
                binarySearch(arr, i, mid - 1, el);
                return;
            } else if (arr[mid] < el) {
                binarySearch(arr, mid + 1, j, el);
                return;
            }
        }
        if(arr[mid] != el) {
            System.out.println("\tindex = " + (-1));
        }
    }
    void bubbleSort(int[] arr) {
        for (int i = 0; i < (count - 1); i++) {
            for(int j = 0; j < (count - i - 1); j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
