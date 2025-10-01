package _17_collection._10_queueDemos;


import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3PriorityQueueCustomObjects {
    public static void main(String[] args) {
        Queue<Employee> queue = new PriorityQueue<>();

        Employee employee1 = new Employee(101, "Suraj", 10000);
        Employee employee2 = new Employee(12, "Rahul", 12000);
        Employee employee3 = new Employee(23, "Komal", 9000);
        Employee employee4 = new Employee(45, "Shital", 15000);
        Employee employee5 = new Employee(47, "Rutuja", 1200);
        Employee employee6 = new Employee(102, "Vaishnawi", 9000);

        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);
        queue.add(employee6);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
