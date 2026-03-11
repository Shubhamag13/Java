import java.util.HashSet;

public class SetToArray {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        Object[] arr = set.toArray();

        for(Object o : arr){
            System.out.println(o);
        }
    }
}
