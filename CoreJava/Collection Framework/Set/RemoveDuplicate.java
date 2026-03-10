import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 4, 9, 7};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        System.out.println("After removing duplicates: " + set);
    }
}
