package Task3.List;

import Task3.Table;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList {
    public static void main(String[] args) {
        int n = 10;

        Table.line();
        System.out.println("Collection >> List >> ArrayList");
        Table.line();

        // ARRAY 1
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add((int)(Math.random()*100));
        }
        System.out.printf("ARRAY_1: %s\n\tsize: %d\n", arr, arr.size());
        Table.line();

        for (int i = 1; i < n; i += 2) {
            arr.add(i,1000);
        }
        System.out.printf("NEW_ARRAY_1: %s\n\tsize: %d\n", arr, arr.size());
        Table.line();

        // ARRAY 2
        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n/5; i++) {
            arr2.add(666);
        }
        System.out.printf("ARRAY_2: %s\n\tsize: %d\n", arr2, arr2.size());
        Table.line();

        arr2.addAll(arr);
        System.out.print("NEW_ARRAY_2 (ARRAY_2 + NEW_ARRAY_1):\n\t[");
        for(Integer i : arr2) {
            System.out.print(i + ", ");
        }
        System.out.printf("\b\b]\n\tsize: %d\n", arr2.size());
        Table.line();

        Collections.sort(arr2);
        System.out.printf("NEW_ARRAY_2 (sorted):\n\t%s\n", arr2);
        Table.line();

        System.out.printf("\tindexOf: 1000 => %d\n", arr2.indexOf(1000));
        System.out.printf("\tlastIndexOf: 1000 => %d\n", arr2.lastIndexOf(1000));
        System.out.printf("\tindexOf: 666 => %d\n", arr2.indexOf(666));
        System.out.printf("\tlastIndexOf: 666 => %d\n", arr2.lastIndexOf(666));
        Table.line();

        // ARRAY 3
        List<String> arr3 = new ArrayList<>();
        arr3.add("Collection");
        arr3.add("List");
        arr3.add("ArrayList");
        System.out.print("ARRAY_3: [");
        for(String i : arr3) {
            System.out.print(i + ", ");
        }
        System.out.printf("\b\b]\n\tsize: %d\n\tget: %s\n", arr3.size(), arr3.get(2));
        Table.line();

        arr3.set(2,"array");
        System.out.printf("NEW_ARRAY_3: %s\n\tset: %s\n", arr3, arr3.get(2));
        Table.line();

        System.out.printf("\tremove: %s\n\t%s\n", arr3.remove(2), arr3);
        Table.line();

        System.out.printf("\tindexOf: Collection => %d\n", arr3.indexOf("Collection"));
        System.out.printf("\tlastIndexOf: List => %d\n", arr3.lastIndexOf("List"));
        System.out.printf("\tindexOf: ArrayList => %d\n", arr3.indexOf("ArrayList"));
        System.out.printf("\tlastIndexOf: array => %d\n", arr3.lastIndexOf("array"));
        Table.line();

        // ARRAY 4
        List<String> arr4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.printf("ARRAY_4: %s\n", arr4);
        Table.line();

        ListIterator<String> listIterator = arr4.listIterator();
        while (listIterator.hasNext()) {
            String el = listIterator.next();
            listIterator.set(el + "+");
        }
        // Измененный arrayList в обратном порядке
        System.out.print("ARRAY_4 (changed & previous): [");
        while (listIterator.hasPrevious()) {
            String el = listIterator.previous();
            System.out.print(el + ", ");
        }
        System.out.println("\b\b]\n\tlistIterator");
        Table.line();

        System.out.print("NEW_ARRAY_4: [");
        int size = arr4.size();
        for (String s : arr4.subList(0, size - 1)) {
            System.out.print(s + ", ");
        }
        System.out.printf("\b\b]\n\tsubList: %s\n", arr4.get(size - 1));
        Table.line();
    }
}
