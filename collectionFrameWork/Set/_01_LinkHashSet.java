package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class _01_LinkHashSet {

    // LinkedHashSet := Maintains insertion order.
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(30);
        set.add(50);
        set.add(60);
        set.add(90);
        set.add(100);
        System.out.println(set);


    }

}
