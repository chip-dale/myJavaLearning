package Task3.Queue;

import Task3.Table;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class MyArrayQueue {
    public static void printQ(Queue q) {
        while (q.peek() != null) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            pq.offer(r.nextInt(i + 10));
        }
        printQ(pq);

        Table.line();

        List<Integer> ints = Arrays.asList(25, 27, 10, 11, 1, 6, 12, 36, 7, 7);
        pq = new PriorityQueue<>(ints);
        printQ(pq);
        pq = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        pq.addAll(ints);
        printQ(pq);

        Table.line();

        String s = "CLEAN-CAT<Lorem_ipsum*dolor+sit+amet>";
        List<String> str = Arrays.asList(s.split(""));
        PriorityQueue<String> strPQ = new PriorityQueue<>(str);
        printQ(strPQ);
        strPQ = new PriorityQueue<>(str.size(), Collections.reverseOrder());
        strPQ.addAll(str);
        printQ(strPQ);

        Table.line();

        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> charPQ = new PriorityQueue<>(charSet);
        printQ(charPQ);
    }
}
