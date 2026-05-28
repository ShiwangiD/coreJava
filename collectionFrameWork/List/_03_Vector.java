package List;

import java.util.List;
import java.util.Vector;

public class _03_Vector {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("A");
        list.add("B");

        System.out.println(list);

    }

}

/*
 * 
 * Vector := Similar to ArrayList but synchronized.
 * Features
 * Thread-safe
 * Slower than ArrayList
 * 
 */