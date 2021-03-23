package Task2;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int[] marks;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    public String listMarks() {
        return Arrays.toString(marks);
    }
    public int averageMark() {
        int sum = 0;
        for(int i : marks) {
            sum += i;
        }
        return sum / marks.length;
    }

    @Override
    public int compareTo(Student s) {
        return (this.id - s.id);
    }

    @Override
    public String toString() {
        return "[name => " + this.name + ", average_mark => " + this.averageMark() + "]";
    }

    public static Comparator<Student> AverageComparator = (s1, s2) -> (int) (s1.averageMark() - s2.averageMark());

    public static Comparator<Student> NameComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());;
}
