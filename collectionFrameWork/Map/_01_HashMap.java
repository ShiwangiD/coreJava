package Map;

import java.util.HashMap;
import java.util.Map;

public class _01_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
         map.put(101, "shivi");
         map.put(102,"shiwangi" );
         map.put(103,"lovely");
         System.out.println(map);

    }

}

/*
 * Map :- Map is an interface in Java used to store data in key-value pairs.
 * HashMap := Most commonly used Map implementation.
 * Features :=
 * Stores key-value pairs
 * No order guaranteed
 * Fast performance
 * Allows one null key and multiple null values
 * 
 */
