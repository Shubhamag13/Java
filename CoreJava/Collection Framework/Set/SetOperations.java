import java.util.HashSet;

public class SetOperations {
    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        // Adding elements to first set
        s1.add(1);
        s1.add(2);
        s1.add(3);

        // Adding elements to second set
        s2.add(3);
        s2.add(4);
        s2.add(5);

        // -------- UNION --------
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        // -------- INTERSECTION --------
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        // Printing results
        System.out.println("Set 1: " + s1);
        System.out.println("Set 2: " + s2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
