package _17_collection._6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1Integers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(56);
        integerList.add(67);
        integerList.add(88);
        integerList.add(101);

        System.out.println("before sorting");
        System.out.println(integerList);

        Collections.sort(integerList);

        System.out.println("after sorting");
        System.out.println(integerList);
    }
}
