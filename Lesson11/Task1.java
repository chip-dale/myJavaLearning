import java.util.Scanner;

/**
 * Создать класс ImrpovedArray, с полем int[] arr, конструктором, принимающим
 *  на вход длину массива и методами:
 * fill - заполнение массива
 * print - вывод массива на монитор
 * linearSearch - линейные поиск (принимает на вход искомый аргумент)
 * binarySearch - бинарный поиск (принимает на вход искомый аргумент)
 * bubbleSort  - пузырьковая сортировка (принимает на вход аргумент,
 *              определяющий порядок сотртировки: по возрастанию или убыванию)
 * insertionSort  - сортировка вставками (принимает на вход аргумент,
 *              определяющий порядок сотртировки: по возрастанию или убыванию)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ARRAY COUNT:\t");
        ImrpovedArray array = new ImrpovedArray(sc.nextInt());
        array.fill();
        array.print();

        System.out.print("\nENTER ELEMENT TO LINEAR SEARCH:\t");
        array.linearSearch(array.arr, sc.nextInt());

        System.out.println("\nSORTING ARRAY ELEMENTS USING BUBBLE SORT:\t");
        array.bubbleSort(array.arr);
        array.print();

        System.out.print("\nENTER ELEMENT TO BINARY SEARCH:\t");
        array.binarySearch(array.arr, sc.nextInt());

        System.out.print("\nENTER COUNT FOR NEW ARRAY:\t");
        ImrpovedArray array2 = new ImrpovedArray(sc.nextInt());
        array2.fill();
        array2.print();

        System.out.println("\nSORTING ARRAY ELEMENTS USING INSERTION SORT:\t");
        array2.insertionSort(array2.arr);
        array2.print();
    }
}

class ImrpovedArray{
    Scanner sc = new Scanner(System.in);

    int[] arr;
    int count;

    ImrpovedArray(int n) {
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
    void linearSearch(int[] arr, int el) {
        int temp = 0;
        for (int i = 0; i < count; i++) {
            temp = arr[i];
            if (temp == el) {
                System.out.println("\tindex = " + i);
                break;
            }
        }
        if(temp != el) {
            System.out.println("\tindex = " + (-1));
        }
    }
    void binarySearch(int[] arr, int el) {
        int i = 0;
        int j = count - 1;
        int mid = 1;
        while(i <= j) {
            mid = (i + j) / 2;
            if(arr[mid] == el) {
                System.out.println("\tindex = " + mid);
                break;
            } else if(arr[mid] < el) {
                i = mid + 1;
            } else if(arr[mid] > el) {
                j = mid - 1;
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
    void insertionSort(int[] arr) {
        for (int i = 1; i < count; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
