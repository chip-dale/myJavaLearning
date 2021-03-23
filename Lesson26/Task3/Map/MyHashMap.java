package Task3.Map;

import Task3.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        Table.line();
        System.out.println("Collection >> Map >> HashMap");
        Table.line();

        Map<Integer, String> map = new HashMap<>();
        // put
        map.put(10, "Alex");
        map.put(20, "Bob");
        map.put(30, "Clare");
        map.put(1, "Anna");
        map.put(15, "John");
        map.put(100, "Anna");
        map.put(2, null);
        System.out.println("Original Map: " + map);
        Table.line();
        // add new, remove, rewrite
        map.put(23, "Ray");
        map.remove(2);
        map.put(15, "Johnny");
        System.out.println("Updated Map: " + map);
        Table.line();
        // keySet, values
        System.out.println(map.keySet());
        System.out.println(map.values());
        Table.line();
        // containsKey, containsValue
        System.out.println("key: 0 => " + map.containsKey(0));
        System.out.println("value: Ray => " + map.containsValue("Ray"));
        System.out.println("key: 1 => " + map.containsKey(1));
        System.out.println("value: John => " + map.containsValue("John"));
        Table.line();
        // replace
        System.out.println("replace(1): " + map.replace(1,"Andrew"));
        System.out.println("replace(30): " + map.replace(30,"Lily"));
        System.out.println(map);
        Table.line();
        // putAll
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(0,"unknown");
        map2.putAll(map);
        System.out.println("new HashMap:\n" + map2);
        Table.line();
        // keySet >> using Set (HashSet)
        Set<Integer> keys = new HashSet<>(map2.keySet());
        System.out.println("keys: " + keys);
        // values >> using List (ArrayList)
        List<String> values = new ArrayList<>(map2.values());
        System.out.println("values: " + values);
        Table.line();
        // clear
        map.clear();
        System.out.println("old Map: " + map);
        Table.line();
    }
}
