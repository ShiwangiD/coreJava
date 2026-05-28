package Map;

import java.util.TreeMap;

public class _03_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(3, "C");
        tree.put(1, "A");
        tree.put(2, "B");

        System.out.println(tree);
    }

}

/*
 * TreeMap := Stores keys in sorted order.
 * Features
 * Sorted by keys
 * No null key allowed
 * 
 * 4. Hashtable :==
 * Older synchronized version of Map.
 * Features
 * Thread-safe
 * No null key/value allowed
 */
