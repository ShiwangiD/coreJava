package Map;

import java.util.LinkedHashMap;

public class _02_LinkHashMap {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> link = new LinkedHashMap<>();
        link.put(19384, "shikha");
        link.put(19453,"nikita");
        link.put(19876,"ankita");
        System.out.println(link);
    }
    
}

/*
 LinkedHashMap := Maintains insertion order.
   feature :=
    order output,
    slightly slower than hashMap.

*/
