package _17_collection._11_mapDemos;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        //HashMap : key ---> unique, homo, hetero, null(1), no IO
        Map map = new HashMap();

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
