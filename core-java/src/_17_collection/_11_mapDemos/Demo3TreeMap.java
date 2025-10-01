package _17_collection._11_mapDemos;

import java.util.Map;
import java.util.TreeMap;

public class Demo3TreeMap {
    public static void main(String[] args) {

        //TreeMap : key ---> unique, homo, null(0),  SO
        Map map = new TreeMap();

        //01. insertion
        map.put(1, "vishnu");
        map.put(1, "vishnu");
        map.put(1, "Vishnu updated");
        // map.put(null, null);
        //map.put(null, null);
        map.put(23, null);
        map.put(2, null);

        System.out.println(map);


    }
}
