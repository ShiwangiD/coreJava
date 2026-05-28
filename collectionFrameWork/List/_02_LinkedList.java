package List;

import java.util.LinkedList;
import java.util.List;

public class _02_LinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(40);
        list.add(39);
        list.add(90);
        list.add(79);
        list.add(30);
        list.add(29);
        System.out.println(list);
    }

}

/*
 * LinkedList :- Uses doubly linked list internally.
 * features :=
 * Better for insertion/deletion
 * Maintains order
 * Slower access than ArrayList
 * 
 */
