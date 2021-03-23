package Task2;

import java.util.Arrays;

/**
 * Создать Student, содержащий имя студента и лист его оценок.
 * Создать возможность сортировки Списка студентов по средней оценке
 * с помощью Comparator и Comparable.
 */
public class Main {
    public static void main(String[] args) {
        Student[] list = {
                new Student(5,"John Doe", new int[]{5,4,3}),
                new Student(6,"Student", new int[]{5,4,3,2,2,3}),
                new Student(1,"Name", new int[]{2,5,4,5})
        };

        for (Student s : list) {
            System.out.printf("(%d) %10s: %s\n", s.getId(), s.getName(), s.listMarks());
        }

        Arrays.sort(list);
        System.out.println("\tСортировка по id:\n"+Arrays.toString(list));

        Arrays.sort(list, Student.AverageComparator);
        System.out.println("\tСортировка по средней оценке:\n"+Arrays.toString(list));

        Arrays.sort(list, Student.NameComparator);
        System.out.println("\tСортировка по имени:\n"+Arrays.toString(list));
    }
}
