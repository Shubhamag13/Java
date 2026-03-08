import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);
    }
}
