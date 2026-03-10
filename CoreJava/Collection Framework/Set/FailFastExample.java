import java.util.HashSet;

public class FailFastExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        for(String s : set){
            System.out.println(s);
            set.add("D");  
            // Modifying set during iteration → Exception
        }
    }
}
