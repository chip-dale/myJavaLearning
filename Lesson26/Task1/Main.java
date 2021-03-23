package Task1;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Создать класс Array реализующий Iterator. (Использовать обобщения)
 */
public class Main {
    public static void main(String[] args) {
        // array integer
        Integer[] arrNum = {1,5,9};
        Array<Integer> numList = new Array<>(arrNum);

        System.out.print("NUMBER ARRAY: {");
        for (Integer num : numList) {
            System.out.print(num + ", ");
        }
        System.out.println("\b\b}");

        Iterator<Integer> itNum = Arrays.stream(arrNum).iterator();
        while (itNum.hasNext()) {
            Integer value = itNum.next();
            if (itNum.hasNext()) {
                System.out.print(value + ", ");
            } else {
                System.out.println(value);
            }
        }

        // array string
        String[] arrStr = {"qwerty","123TXT"};
        Array<String> strList = new Array<>(arrStr);

        System.out.print("STRING ARRAY: {");
        for (String str : strList) {
            System.out.print(str + ", ");
        }
        System.out.println("\b\b}");

        Iterator<String> itStr = Arrays.stream(arrStr).iterator();
        while (itStr.hasNext()) {
            String value = itStr.next();
            if (itStr.hasNext()) {
                System.out.print(value + ", ");
            } else {
                System.out.println(value);
            }
        }
    }
}
