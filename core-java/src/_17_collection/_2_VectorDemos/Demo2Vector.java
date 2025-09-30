package _17_collection._2_VectorDemos;

import java.util.Vector;

public class Demo2Vector {
    public static void main(String[] args) {
        // multiple values --> homogeneous, heterogeneous, duplicate, null, insertion order
        Vector vector = new Vector(); // create the container
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add("abc");
        vector.add("abc");
        vector.add(null);
        vector.add(null);
        vector.add(null);
        vector.add(null);

        System.out.println(vector.toString());
        System.out.println("size of the vector "+vector.size());
        System.out.println("is vector empty "+vector.isEmpty());
        System.out.println("whether abc is present in the vector "+vector.contains("abc"));

    }
}
