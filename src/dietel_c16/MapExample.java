package dietel_c16;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        //                          TreeMap ordered
        //                          Hashtable ordered

        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println(map);

    }
}
