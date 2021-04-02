/**
 * <p>СТУДЕНТ: Исмаилова Фидан</p>
 * <p>ГРУППА: WEJM_12012_ru</p>
 * <p>ДАТА: 03.11.2020</p>
 * <p>ТЕМА: Операторы; Пользовательский ввод</p>
 * <p>ЗАДАЧА 1: Разбить 3-х значное число на составляющие<br>
 * Пример: 569 => 5<br>
 *                6<br>
 *                9</p>
 * <p>ЗАДАЧА 2: Введите 2 числа и выведите результат с ниже приведенными операторами:<br>
 * <i>+ - / * % += -+ /= *= %= ++ --</i><br>
 * Пример вхоных чисел: 10 5<br>
 * Вывод: 10 / 5 = 2 и так далее</p>
 * <p>ЗАДАЧА 3: Создайте массив из 5-и элементов. Задайте значение каждого элемента массива с терминала.</p>
 * <p>ЗАДАЧА 4: Посчитайте кол-во четных элементов в массиве из 5 элементов.</p>
 */
import java.util.Scanner;

public class ScannerNextStringOperators {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Разбить 3-х значное число на составляющие
        System.out.println("TASK #1");
        int x = 593;
        //вариант1
        System.out.println("The number " + x + " consists of:");
        System.out.println((x / 100) + " >> hundreds");
        System.out.println((x / 10 % 10) + " >> tens");
        System.out.println((x % 10) + " >> units");
        System.out.println("***");
        //вариант2
        System.out.println("Запись с пробелами:");
        System.out.println(x + " => " + (x / 100) + "\n\s\s\s\s\s\s\s" + (x / 10 % 10) + "\n\s\s\s\s\s\s\s" + (x % 10));
        System.out.println("Запись с табуляциями:");
        System.out.println(x + "\t=>\t" + (x / 100) + "\n\t\t" + (x / 10 % 10) + "\n\t\t" + (x % 10));
        System.out.println("***");
        //вариант3 >> с вводом числа
        System.out.println("Please enter three-digit number >> ");
        int y = sc.nextInt();   //TODO: ???КАК СДЕЛАТЬ ЧИСЛО СТРОГО ТРЕХЗНАЧНЫМ??? :-(
        System.out.println("Thanks!");
        System.out.println(y + "\t=>\n\t" + (y / 100) + " (hundreds)\n\t" + (y / 10 % 10) + " (tens)\n\t" + (y % 10) + " (units)");
        System.out.println("***");

        // Ввести 2 числа и вывести результат с операторами
        System.out.println("TASK #2");
        int a, b;
        System.out.println("Please enter number A >> ");
        a = sc.nextInt();
        System.out.println("Please enter number B >> ");
        b = sc.nextInt();
        System.out.println("RESULTS >> ");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println("Variant #1");
        System.out.println(a + " += " + b + " => " + (a + b));
        System.out.println(a + " -= " + b + " => " + (a - b));
        System.out.println(a + " *= " + b + " => " + (a * b));
        System.out.println(a + " /= " + b + " => " + (a / b));
        System.out.println(a + " %= " + b + " => " + (a % b));
        System.out.println("++" + a + " => " + (a + 1));
        System.out.println("++" + b + " => " + (b + 1));
        System.out.println("--" + a + " => " + (a - 1));
        System.out.println("--" + b + " => " + (b - 1));
        System.out.println("Variant #2");   // с использованием операторов присвоения, при которых значение уже меняется
        System.out.println(a + " += " + b + " => " + (a += b));
        System.out.println(a + " -= " + b + " => " + (a -= b));
        System.out.println(a + " *= " + b + " => " + (a *= b));
        System.out.println(a + " /= " + b + " => " + (a /= b));
        System.out.println(a + " %= " + b + " => " + (a %= b));
        System.out.println("++A => ++" + a + " => " + (++a));
        System.out.println("++B => ++" + b + " => " + (++b));
        System.out.println("--A => --" + a + " => " + (--a));
        System.out.println("--B => --" + b + " => " + (--b));
        System.out.println("***");

        // Массив из 5-и элементов >> Задать значение каждого элемента с терминала
        System.out.println("TASK #3");
        //вариант1
        System.out.println(" >> STRING >> next() >> ");
        String s1, s2, s3, s4, s5;
        System.out.println("Please enter Variable Name 1 >> ");
        s1 = sc.next(); // TODO: next() >> если вводить переменную через пробел, то всё, что после пробела - след.переменная
        System.out.println("Please enter Variable Name 2 >> ");
        s2 = sc.next(); // TODO: если начать ввод с кавычек >> похоже, что первый символ после принимает за CHAR ???
        System.out.println("Please enter Variable Name 3 >> ");
        s3 = sc.next();
        System.out.println("Please enter Variable Name 4 >> ");
        s4 = sc.next();
        System.out.println("Please enter Variable Name 5 >> ");
        s5 = sc.next();
        String[] arr = {s1, s2, s3, s4, s5};
        System.out.println("Thanks!\nYour ARRAY is:\n\t" + arr[0] + ";\n\t" + arr[1] + ";\n\t" + arr[2] + ";\n\t" + arr[3] + ";\n\t" + arr[4] + ".");
        //вариант2
        System.out.println(" >> STRING >> nextLine() >> ");
        String sL1, sL2, sL3, sL4, sL5;
        System.out.println("Please enter Variable Name 1 (Line) >> ");
        sL1 = sc.nextLine();    // TODO: ??ввод первой строки пропадает :-(
        System.out.println("Please enter Variable Name 2 (Line) >> ");
        sL2 = sc.nextLine();
        System.out.println("Please enter Variable Name 3 (Line) >> ");
        sL3 = sc.nextLine();
        System.out.println("Please enter Variable Name 4 (Line) >> ");
        sL4 = sc.nextLine();
        System.out.println("Please enter Variable Name 5 (Line) >> ");
        sL5 = sc.nextLine();
        String[] arrL = {sL1, sL2, sL3, sL4, sL5};
        System.out.println("Thanks!\nYour ARRAY is:\n\t" + arrL[0] + ";\n\t" + arrL[1] + ";\n\t" + arrL[2] + ";\n\t" + arrL[3] + ";\n\t" + arrL[4] + ".");
        //вариант3
        System.out.println(" >> INT >> ");
        int i1, i2, i3, i4, i5;
        System.out.println("Please enter Variable Num 1 >> ");
        i1 = sc.nextInt();
        System.out.println("Please enter Variable Num 2 >> ");
        i2 = sc.nextInt();
        System.out.println("Please enter Variable Num 3 >> ");
        i3 = sc.nextInt();
        System.out.println("Please enter Variable Num 4 >> ");
        i4 = sc.nextInt();
        System.out.println("Please enter Variable Num 5 >> ");
        i5 = sc.nextInt();
        int[] num = {i1, i2, i3, i4, i5};
        System.out.println("Thanks!\nYour ARRAY is:\n\t" + num[0] + ";\n\t" + num[1] + ";\n\t" + num[2] + ";\n\t" + num[3] + ";\n\t" + num[4] + ".");
        System.out.println("***");

        // Посчитайте кол-во четных элементов в массиве из 5 элементов.
        System.out.println("TASK #4");
        //для примера: последний массив num[]
        i1 %= 2;
        i2 %= 2;
        i3 %= 2;
        i4 %= 2;
        i5 %= 2;
        int sum = 5 - (i1 + i2 + i3 + i4 + i5);
        System.out.println("Amount of even numbers is: " + sum);
    }
}
