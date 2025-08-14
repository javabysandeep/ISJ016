package _13_string_handling;

public class Demo20Capacity {
    public static void main(String[] args) {
        //capacity ---> max elements that can be added
        //length --> actual elements
        //default capacity is 16
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("length " + sb.length());//5
        System.out.println("capacity " + sb.capacity());//21


        StringBuilder sb1 = new StringBuilder(50);
        sb1.append("hello");
        System.out.println("length " + sb1.length());//5
        System.out.println("capacity " + sb1.capacity());//50
    }
}
