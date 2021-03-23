package Task3;

import java.util.*;

/**
 * <p>Использовать методы коллекций:</p>
 * <ol>
 *     <li>List (add, addAll, get, indexOf, lastIndexOf, listIterator, set, sort, subList)</li>
 *      <ul>
 *          <li>ArrayList</li>
 *          <li>LinkedList</li>
 *      </ul>
 *     <li>Set (first, headSet, last, subSet)</li>
 *      <ul>
 *          <li>HashSet</li>
 *          <li>LinkedHashSet</li>
 *      </ul>
 *     <li>Queue (element, peek, offer, poll, remove)</li>
 *      <ul>
 *          <li>ArrayQueue</li>
 *          <li>LinkedList</li>
 *      </ul>
 *     <li>Map (clear, containsKey, containsValue, keySet, put, putAll, replace, values)</li>
 *      <ul>
 *          <li>HashMap</li>
 *      </ul>
 * </ol>
 */
public class Main {
    public static void main(String[] args) {
        line();
        System.out.println("Использовать методы коллекций:");
        line();
        System.out.println("List (add, addAll, get, indexOf, lastIndexOf, listIterator, set, sort, subList)");
        System.out.println("\tArrayList\n\tLinkedList");
        line();
        System.out.println("Set (first, headSet, last, subSet)");
        System.out.println("\tHashSet\n\tLinkedHashSet");
        line();
        System.out.println("Queue (element, peek, offer, poll, remove)");
        System.out.println("\tArrayQueue\n\tLinkedList");
        line();
        System.out.println("Map (clear, containsKey, containsValue, keySet, put, putAll, replace, values)");
        System.out.println("\tHashMap");
        line();
        System.out.println("Брюс Эккель - Философия Java - 2015");
    }
    public static void line() {
        for (int i = 0; i < 50; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
