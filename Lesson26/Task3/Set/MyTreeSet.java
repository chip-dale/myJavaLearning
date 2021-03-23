package Task3.Set;

import Task3.Table;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        Table.line();
        System.out.println("Collection >> Set >> TreeSet");
        Table.line();

        SortedSet<String> set = new TreeSet<>();
        set.add("Свекла"   );
        set.add("Огурцы"   );
        set.add("Помидоры" );
        set.add("Картофель");
        set.add("Морковь"  );
        // Данная запись не должна попасть в набор
        set.add("Картофель");

        System.out.println("\tSortedSet >> TreeSet:\n" + set);
// Вывести в консоль размер набора
        System.out.println("\tsize: " + set.size());
        Table.line();

// Вывести в консоль записи
        Iterator<String> itr = set.iterator();
        System.out.print("\titerator:\n[");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println("\b\b]");
        Table.line();

        System.out.println("\tfirst: " + set.first());
        System.out.println("\tlast: " + set.last());
        Table.line();

        System.out.println("\theadSet: " + set.headSet("Огурцы"));
        System.out.println("\tsubSet: " + set.subSet("Морковь",set.last()));
        Table.line();
    }
}
