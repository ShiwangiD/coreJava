package List;

// import java.util.List;
// import java.util.ListIterator;
// import java.util.ArrayList;

import java.util.*;

public class _01_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // System.out.println(list.get(1));

        // list.set(2, 5);
        // System.out.println(list.toString());

        // list.addAll(0,List.of(8,9,5,4));
        // System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        // list.indexOf(2);
        // System.out.println(list);
        // list.lastIndexOf(5);
        // System.out.println(list);

        // ListIterator<Integer> it = list.listIterator(2);
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // while(it.hasPrevious()){
        // System.out.println(it.previous());
        // }

        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(l);

        List<Integer> l2 = List.copyOf(l);
        System.out.println(l2);

    }
}

/*
 * 
 * ArrayList : = Most commonly used List implementation.
 * features :=
 * Fast data retrieval
 * Dynamic array
 * Maintains insertion order
 */
