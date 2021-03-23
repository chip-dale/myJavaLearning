package Task3.Set;

import Task3.Table;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Table.line();
        System.out.println("Collection >> Set >> HashSet");
        Table.line();

        Random random = new Random(30);
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 25; i++) {
            set.add(random.nextInt(10));
        }

        Iterator<Integer> itr = set.iterator();
        System.out.print("iterator: [");
        while (itr.hasNext()) {
            System.out.print(itr.next().toString() + ", ");
        }
        System.out.println("\b\b]");
        Table.line();
    }
}
