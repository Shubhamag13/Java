import java.util.*;

public class HashMapToArrayList {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");

        // Convert Keys to ArrayList
        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());

        // Convert Values to ArrayList
        ArrayList<String> valueList = new ArrayList<>(map.values());

        System.out.println("Keys: " + keyList);
        System.out.println("Values: " + valueList);
    }
}
