/*
    СТУДЕНТ: Исмаилова Фидан
    ГРУППА: WEJM_12012_ru
    ДАТА: 31.10.2020
    ТЕМА: Массивы
    ЗАДАЧА: Найти ср.арифм.значение массива (без цикла for);
    Записать "Hello World!" через массив (не использовать String!)
*/
public class AverageAndArrays {
    public static void main (String[] args){
    // Среднее арифметическое значение
        //вариант1
        int[] arr = {123, 232, 5, 68, 9};
        double sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println(sum / 5);
        //вариант2
        double[] arrN = {123, 232, 5, 68, 9};
        System.out.println((arrN[0] + arrN[1] + arrN[2] + arrN[3] + arrN[4]) / 5);

    // Массив >> вывести фразу Hello World!
        char[] n = {'H', 'e', 'l', 'l', 'o', 160, 'W', 'o', 'r', 'l', 'd', '!'};
        //вариант1
        System.out.println("\"" + n[0] + n[1] + n[2] + n[3] + n[4] + n[5] + n[6] + n[7] + n[8] + n[9] + n[10] + n[11] + "\"");
        //вариант2
        System.out.print("\"");
        System.out.print(n[0]);
        System.out.print(n[1]);
        System.out.print(n[2]);
        System.out.print(n[3]);
        System.out.print(n[4]);
        System.out.print(n[5]);
        System.out.print(n[6]);
        System.out.print(n[7]);
        System.out.print(n[8]);
        System.out.print(n[9]);
        System.out.print(n[10]);
        System.out.print(n[11]);
        System.out.print("\"");
    }
}
