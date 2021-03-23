package Task3.Queue;

import Task3.Table;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        Table.line();

        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        System.out.print("ARRAY_DEQUE: [");
        while (adq.peek() != null) {
            System.out.print(adq.pop() + ", ");
        }
        System.out.println("\b\b]");

        Table.line();
        System.out.println("updated DEQUE");
        Table.line();

        adq.add("Germany");
        adq.addFirst("France"); // добавляем элемент в самое начало
        adq.push("Great Britain"); // добавляем элемент в самое начало
        adq.addLast("Spain"); // добавляем элемент в конец коллекции
        adq.add("Italy");

        String sFirst = adq.getFirst();
        System.out.println("first element: " + sFirst);
        Table.line();

        String sLast = adq.getLast();
        System.out.println("last element: " + sLast);
        Table.line();

        System.out.printf("Queue size: %d \n", adq.size());
        Table.line();

        /*System.out.println("element: " + adq.element());
        Table.line();

        System.out.println("poll: " + adq.poll());
        Table.line();

        System.out.println("remove: " + adq.remove());
        Table.line();*/

        System.out.print("[");
        while (adq.peek() != null) {
            System.out.print(adq.pop() + ", ");
        }
        System.out.println("\b\b]");
        Table.line();
    }
}
