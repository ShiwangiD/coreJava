package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _01_HashSet {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("lovely");
        set.add("Shiwangi");
        set.add("Shikha");

        System.out.println(set.contains("Shiwangi"));


        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Shivanya");
        map.put(102,"shivesh");
        map.put(103,"Avani");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(102));
    }
    
}
