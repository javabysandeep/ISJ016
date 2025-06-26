package _7_class_components;

public class Demo17Constants {
    public static void main(String[] args) {
        System.out.println("Mysql dev credentials");
        System.out.println(Constants.Mysql.Dev.USERNAME);
        System.out.println(Constants.Mysql.Dev.PASSWORD);


        System.out.println("Mysql qa credentials");
        System.out.println(Constants.Mysql.Qa.USERNAME);
        System.out.println(Constants.Mysql.Qa.PASSWORD);


        System.out.println("Mysql prod credentials");
        System.out.println(Constants.Mysql.Prod.USERNAME);
        System.out.println(Constants.Mysql.Prod.PASSWORD);
    }
}
