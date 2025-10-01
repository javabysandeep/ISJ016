package _17_collection._10_queueDemos;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2PriorityQueueImplementationOfQueue {
    public static void main(String[] args) {
        //elements in priorityQueue must be of same type
        //Priority: by default elements are processed in ascending order
        Queue queue = new PriorityQueue();
        //01. insertion
        queue.add("vishnu");
        queue.add("suyash");
        queue.add("rutuja");
        queue.add("vaishnwi");
        queue.add("nikita");
        queue.add("vaishnwi");
        queue.add("komal");
        queue.add("shital");

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
        System.out.println("processed : " + queue.remove());
        System.out.println("processed : " + queue.remove());
        System.out.println("processed : " + queue.remove());

    }
}
