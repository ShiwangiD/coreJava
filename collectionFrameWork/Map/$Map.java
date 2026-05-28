package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class $Map {
    public static void main(String[] args) {
        // RollNo, Names
        Map<Integer, String> map = new HashMap<>();
        map.put(1011, "aditya");
        map.put(1022, "Raushan");
        map.put(2345, "prity");
        map.put(1234, "aditya");

        // System.out.println(map);

        // Methods :=
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
        // System.out.println(map.containsKey(1011));
        // System.out.println(map.containsValue("aditya"));
        // System.out.println(map.get(1022));
        // System.out.println(map.put(1026, "lovely"));
        // System.out.println(map.put(1011, "lovely"));
        // System.out.println(map.get(1011));// get updated value

        // System.out.println(map.remove(1011));

        // Map<Integer,String> map2 = new HashMap<>();
        // map.putAll(map2);

        // map.clear();
        // Set<Integer> set = map.keySet(); // return set
        // System.out.println(set);

        // Collection<String> c = map.values(); // return collection
        // System.out.println(c);

        // Set<Map.Entry<Integer,String>> entry = map.entrySet();
        // System.out.println(entry);

        // System.out.println(map.getOrDefault(1011, "unknow"));
        // System.out.println(map.putIfAbsent(1022, "lucky"));
        // System.out.println(map.remove(1022,"Abhay"));
        // System.out.println(map.replace(1022, "lovely","lucci"));

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " , " + value);
        }
        Map<Integer, String> map_1 = Map.of(101,"sita",102,"gita",103,"ankita",104,"nikata");
        System.out.println(map_1);


    }

}

// put()--> always replaces
// putIfAbsent() --> does not replace exiting value