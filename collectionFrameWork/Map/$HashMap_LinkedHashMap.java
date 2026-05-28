package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class $HashMap_LinkedHashMap {
    public static void main(String[] args){

        // Types of creating HashMap 
        Map<Integer,String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(100);
        Map<Integer,String> map3 = new HashMap<>(100,20);
        Map<Integer,String> map4 = new HashMap<>(map3);

        // Diffrenet type of creating LinkedHashMap

         Map<Integer,String> map5 = new LinkedHashMap<>();
        Map<Integer, String> map6 = new LinkedHashMap<>(100);
        Map<Integer,String> map8 = new LinkedHashMap<>(100,20);
        Map<Integer,String> map9 = new LinkedHashMap<>(map8

        );
    }
    
}
