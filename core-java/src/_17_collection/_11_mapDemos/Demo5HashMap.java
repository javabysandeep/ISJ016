package _17_collection._11_mapDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo5HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        //hashMap.put("abc",123);//CTE
        hashMap.put(1, "Suyash");
        hashMap.put(11, "Vishnu");
        hashMap.put(2, "Komal");
        hashMap.put(3, "Shital");
        hashMap.put(13, "Nikita");

        //01. remove an entry

        System.out.println("before removal");
        System.out.println(hashMap);


        hashMap.remove(1);
        hashMap.clear();

        System.out.println("after removal");
        System.out.println(hashMap);
    }
}
