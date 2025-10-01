package _17_collection._11_mapDemos;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2LinkedHashMap {
    public static void main(String[] args) {

        //LinkedHashMap : key ---> unique, homo, hetero, null(1),  IO
        Map map = new LinkedHashMap();

        //01. insertion
        map.put(1, "vishnu");
        map.put(1, "vishnu");
        map.put(null, null);
        map.put(null, null);
        map.put("abc", null);
        map.put("xyz", null);

        System.out.println(map);


    }
}
