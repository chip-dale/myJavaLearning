package Task3.Queue;

import Task3.Table;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MyLinkedList {
    public static void printQ(Queue q) {
        while (q.peek() != null) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            q.offer(r.nextInt(i + 10));
        }
        printQ(q);

        Table.line();

        Queue<Character> qc = new LinkedList<>();
        for (char c : "Blablabla".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
