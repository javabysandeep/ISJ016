package _11_object_class_methods;

public class Demo1GetClassMethod /*extends Object*/ {
    public static void main(String[] args) {
        Demo1GetClassMethod ref =  new Demo1GetClassMethod();
        Class<? extends Demo1GetClassMethod> classTypeRef = ref.getClass();
        System.out.println(classTypeRef.getName());
        System.out.println(classTypeRef.getPackageName());
        System.out.println(classTypeRef.getSimpleName());
        System.out.println(classTypeRef.getMethods()[0].getName());
    }
}
