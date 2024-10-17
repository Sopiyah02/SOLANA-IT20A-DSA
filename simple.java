import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class simple {

    public static void main(String[] args) {
        // Creating a queue using a LinkedList
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Grapes");
        queue.add("lanzones");
        queue.add("Strawberry");
        
        while (!queue.isEmpty()){
        // Printing the remaining elements in the queue
        System.out.println(queue.poll());
    }
}
}