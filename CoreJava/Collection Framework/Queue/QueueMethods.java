import java.util.*;

public class QueueMethods {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        System.out.println("Peek: " + queue.peek()); // Front element

        System.out.println("Poll: " + queue.poll()); // Removes front

        System.out.println("After Poll: " + queue);
    }
}
