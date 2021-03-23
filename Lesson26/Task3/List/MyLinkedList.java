package Task3.List;

import Task3.Table;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList {
    public static void main(String[] args) {
        int n = 10;

        Table.line();
        System.out.println("Collection >> List >> LinkedList");
        Table.line();
        // add, addAll
        List<Integer> lnk = new LinkedList<>();
        lnk.add(159);
        lnk.add(46);
        lnk.add(8);
        lnk.add(lnk.size());
        lnk.add(n);
        lnk.addAll(Collections.synchronizedList(lnk));
        System.out.printf("LIST: %s\n\tsize: %d\n", lnk, lnk.size());
        Table.line();
        // get
        System.out.print("\tget: ");
        for (int i = 0; i < lnk.size(); i++) {
            System.out.print(lnk.get(i) + ", ");
        }
        System.out.println("\b\b");
        Table.line();
        // indexOf, lastIndexOf
        System.out.printf("\tindexOf: 8 => %d\n", lnk.indexOf(8));
        System.out.printf("\tlastIndexOf: 8 => %d\n", lnk.lastIndexOf(8));
        Table.line();
        // listIterator
        ListIterator it = lnk.listIterator();

        System.out.print("Forward iteration:\n\t[");
        while(it.hasNext()){
            System.out.print(it.next() + ", ");
        }
        System.out.println("\b\b]");
        Table.line();

        System.out.print("Backward iteration:\n\t[");
        while(it.hasPrevious()){
            System.out.print(it.previous() + ", ");
        }
        System.out.println("\b\b]");
        Table.line();
        // set
        System.out.printf("LIST: %s\n", lnk);
        System.out.printf("\tset(1): %d => %d\n\tset(3): %d => %d\n",
                lnk.set(1, 5), lnk.get(1), lnk.set(3, 11), lnk.get(3));
        System.out.printf("LIST: %s\n", lnk);
        Table.line();
        // sort
        Collections.sort(lnk);
        System.out.printf("Sorted list:\n\t%s\n", lnk);
        Table.line();
        // subList
        List sub = lnk.subList(1, lnk.size()-1);
        System.out.printf("Sublist (without first & last elements):\n\t%s\n", sub);

        sub.add(0,15);
        System.out.printf("\tadd(0): %d\nSublist: %s\n", sub.get(0), sub);
        Table.line();

        System.out.printf("LIST: %s\n\tsize: %d\n", lnk, lnk.size());
        Table.line();
    }
}
