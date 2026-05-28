package Set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class _01_TreeSet {
    public static void main(String[] args) {
        
        // TreeSet :== store element in sorted order.

        TreeSet<Integer> set = new TreeSet<>();
        // Set<Integer> set1 = new TreeSet<>(List.of(2, 5, 7, 9));

        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);
        set.add(30);

        // #### sorted Interface ---> o(log N)

        System.out.println(set.first());
        System.out.println(set.last());

        // BST --> leftest most node ---> smallest
        //rightest most node ----> largest

        System.out.println(set.headSet(80));  // lower element
        System.out.println(set.tailSet(30)); // higher element

       // from element is inclusive and toElement is exclusive
        System.out.println(set.subSet(23, 80));

        // #### Nevigable set

        // largest number smaller than 80
        System.out.println(set.lower(80));

        // greatest  element less then or equal to 80
        System.out.println(set.floor(80));

        // smallest number greather then 80
        System.out.println(set.higher(80));

        // smallest number greather then 80 or equal 80
        System.out.println(set.ceiling(80));

        
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.descendingSet());

        Iterator<Integer> it = set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(set.headSet(80,true));
        System.out.println(set.tailSet(80,false));
        System.out.println(set.subSet(10,false,80,true));

    }

}
