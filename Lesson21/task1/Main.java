package task1;

import java.util.Scanner;

import static task1.Season.*;

/**
 * Создать enum Season со всеми сезонами.
 * Каждый из них должен содержать в себе набор месяцев в виде чисел.
 * Добавить метод checkMonth, который будет проверять,
 * находится ли данный месяц в данном сезоне:
 * если да - возвращаем название месяца,
 * если нет - генерируем исключение, созданное вами.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Season season;

        System.out.print("Seasons: { ");
        for(Season s : values()) {
            System.out.print(s + ", ");
        }
        System.out.println("\b\b }");

        /*
        месяца должны возвращаться в методе checkMonth.
        при совпадении вводимого параметра n,
        и одного из месяцев сезона ( например n=12 , WINTER(12,1,2))
        должен возвращаться соответсвующий месяц то есть декабрь = 12.
         */

        while(true) {
            System.out.print("ENTER MONTH NUM: ");
            Season.checkMonth(sc.next());
        }
    }
}
