package _17_collection._11_mapDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        //hashMap.put("abc",123);//CTE
        hashMap.put(1, "Suyash");
        hashMap.put(11, "Vishnu");
        hashMap.put(2, "Komal");
        hashMap.put(3, "Shital");
        hashMap.put(13, "Nikita");

        //01. get only keys
        System.out.println("only keys : " + hashMap.keySet());

        //02. get only values
        System.out.println("only values : " + hashMap.values());

        //03. get all entries
        System.out.println("getting all entries");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("key = " + entry.getKey() + "\t value = " + entry.getValue());
        }
        System.out.println("search key " + hashMap.containsKey(1));
        System.out.println("search value " + hashMap.containsValue("Komal"));
    }
}
