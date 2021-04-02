package task2;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Создайте 2 аннотации. 1-ая для метода, вторая для класса.
 * В первой задайте свойство name, во второй value.
 * Примените данные аннотации над каким-либо классом.
 * В main методе найдите данные аннотации и выведите на экран их свойства
 */

@Annotation2(value = 123)
public class Main {
    public static void main(String[] args) {
        myMethod();
    }
    @Annotation1(name = "blablabla")
    public static void myMethod() {
        Main ob = new Main();

        try {
            System.out.println("Получение аннотаций во время выполнения с помощью рефлексии:");
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMethod");
            Annotation1 anno1 = m.getAnnotation(Annotation1.class);
            System.out.println(anno1.name() + " >> для метода");
            Annotation2 anno2 = c.getAnnotation(Annotation2.class);
            System.out.println(anno2.value() + " >> для класса");

            System.out.println("\nПолучение всех аннотаций:");
            Annotation annos[] = ob.getClass().getAnnotations();
            //Annotation annos[] = c.getAnnotations();
            for(Annotation a : annos) System.out.println(a + " >> Аннотация тестового класса");
            Method m2 = ob.getClass().getMethod("myMethod");
            //Method m2 = c.getMethod("myMethod");
            annos = m2.getAnnotations();
            for(Annotation a : annos) System.out.println(a + " >> Аннотация тестового метода");
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
}
