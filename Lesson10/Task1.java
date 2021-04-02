/*
 * Создать класс Math с методами, принимающими на вход числа:
 * сложение двух чисел
 * вычитание двух чисел
 * умножение двух чисел
 * деление двух чисел, с проверкой на ноль
 * возведение в степень числа (первый аргумент число, второй аргумет степень)
 */
public class Task1 {
    public static void main (String[] args) {
        Math oop = new Math();

        int sum = oop.getSum(10,5);
        System.out.println("сложение: " + sum);

        int difference = oop.getDifference(10,5);
        System.out.println("вычитание: " + difference);

        int multiplication = oop.getMultiplication(10,5);
        System.out.println("умножение: " + multiplication);

        int division = oop.getDivision(10,5);
        System.out.println("деление: " + division);

        int power = oop.getPower(10,5);
        System.out.println("степень: " + power);
    }
}

class Math {
    int getSum(int a, int b) {
        return a + b;
    }
    int getDifference(int a, int b) {
        return a - b;
    }
    int getMultiplication(int a, int b) {
        return a * b;
    }
    int getDivision(int a, int b) {
        return a / b;   //TODO: с проверкой на ноль
    }
    int getPower(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }
}
