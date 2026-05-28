package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class _02_HashSet {
    public static void main(String[] args){

        // Constructor of HashSet / LinkHashSet
        Set<Integer> set = new HashSet<>(); // 16 size by default buckect size

        // initial capacity
        Set<Integer> set2 = new HashSet<>(100);

        //capacity,Load Factor ---> by default load factor is 0.75

        Set<Integer> set3 = new HashSet<>(100,0.8f);

        // using another collection 
        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));


    }
    
}
