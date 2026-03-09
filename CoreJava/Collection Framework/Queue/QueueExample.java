import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Dequeue (remove element)
        int removed = queue.remove();
        System.out.println("Removed: " + removed);

        System.out.println("Queue after removal: " + queue);
    }
}
