import java.util.HashSet;

public class SubsetExample {
    public static void main(String[] args) {

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        A.add(1); A.add(2); A.add(3); A.add(4);
        B.add(2); B.add(3);

        System.out.println("B is subset of A? " + A.containsAll(B));
    }
}
