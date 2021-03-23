package Task3.Set;

import Task3.Table;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        Table.line();
        System.out.println("Collection >> Set >> LinkedHashSet");
        Table.line();

        LinkedHashSet<String> linkedset = new LinkedHashSet<>();
        // Adding element to LinkedHashSet
        linkedset.add("Maruti");
        linkedset.add("BMW");
        linkedset.add("Honda");
        linkedset.add("Audi");
        linkedset.add("Maruti"); //This will not add new element as Maruti already exists
        linkedset.add("WalksWagon");

        System.out.println("Size of LinkedHashSet: " + linkedset.size());
        Table.line();
        System.out.println("Original LinkedHashSet: " + linkedset);
        Table.line();

        System.out.println("Removing Audi from LinkedHashSet: " + linkedset.remove("Audi"));
        Table.line();

        System.out.println("Trying to Remove Z which is not present: "
                + linkedset.remove("Z"));
        Table.line();

        System.out.println("Checking if Maruti is present: " + linkedset.contains("Maruti"));
        Table.line();

        System.out.println("Updated LinkedHashSet: " + linkedset);
        Table.line();
    }
}
