package _11_object_class_methods;

public class Demo4 {
    public static void main(String[] args) {


        Demo4 ref = new Demo4();
        System.out.println("hashCode in integer " + ref.hashCode());
        System.out.println("hashCode converted to Hexadecimal " + Integer.toHexString(ref.hashCode()));
        System.out.println("Class Name along with the package " + ref.getClass().getName());

        System.out.println("************* ToString demo **********************************");
        System.out.println(ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode()));

        System.out.println(ref);//automatically it calls the toString
        System.out.println(ref.toString());
    }


}
