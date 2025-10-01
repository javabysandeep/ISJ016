package _17_collection._10_queueDemos;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1LinkedListImplementationOfQueue {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        //01. insertion
        queue.add(100);
        queue.add("abc");
        queue.add("xyz");
        queue.add("200");

        //02. inspection
        System.out.println("who's next " + queue.peek());//100 and if empty --> null
        System.out.println("who's next " + queue.element());//100 and if empty --> exception


        //03. deletion
        System.out.println("processed : " + queue.poll());
        System.out.println("processed : " + queue.poll());
        System.out.println("processed : " + queue.poll());
        System.out.println("processed : " + queue.poll());
        System.out.println("processed : " + queue.poll());
        System.out.println("processed : " + queue.remove());

    }
}
