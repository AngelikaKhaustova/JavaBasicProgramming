package homework_41;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);


        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static  Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2){
        Collection<String> keySet1 = new ArrayList<>();
        keySet1 = map1.keySet();

        Collection<String > keySet2 = new ArrayList();
        keySet2 = map2.keySet();

        keySet1.retainAll(keySet2);

        Map<String, Integer> map3 = new HashMap<>();

        for(String key : keySet1 ){
            map3.put(key, map1.get(key));
        }
        return map3;
    }
}
