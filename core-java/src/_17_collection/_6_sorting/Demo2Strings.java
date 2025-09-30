package _17_collection._6_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2Strings {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("vishnu");
        arrayList.add("suyash");
        arrayList.add("komal");
        arrayList.add("shital");
        arrayList.add("vaishnwai");
        arrayList.add("rutuja");

        System.out.println("Before sorting");
        System.out.println(arrayList);

        Collections.sort(arrayList);//internally calls compareTo() method

        System.out.println("after sorting");
        System.out.println(arrayList);

    }
}
