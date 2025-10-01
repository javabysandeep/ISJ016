package _17_collection._11_mapDemos;

import java.util.HashMap;

public class Demo6CharacterOccurrence {
    public static void main(String[] args) {
        String str = "good morning";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);
    }
}
