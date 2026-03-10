import java.util.HashSet;

public class DifferenceExample {
    public static void main(String[] args) {

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        A.add(1); A.add(2); A.add(3); A.add(4);
        B.add(3); B.add(4); B.add(5);

        HashSet<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);

        System.out.println("A - B : " + difference);
    }
}
