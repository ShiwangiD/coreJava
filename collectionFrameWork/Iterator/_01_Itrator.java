package Iterator;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
import java.util.*;

public class _01_Itrator {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // List<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        Collection<Integer> c = new HashSet<>();
        c.add(60);
        c.add(50);
        c.add(70);
        c.add(90);

        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        // Iterator<Integer> it = list.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next());

        // }

    }

}

/*
 * 
 * Collection Framework := set of classes and interfaces in java that help you
 * store data,organize and manipulate .
 * Hashset ==> value hashcode ke orcording store karta h.
 * Iterator:- an object used to traverse elements of a collection one by one.
 * access elements sequentially and remove elements safely while iterating
 */
