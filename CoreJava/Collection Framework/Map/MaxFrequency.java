import java.util.HashMap;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 2, 3, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxCount = 0;

        for(int key : map.keySet()){
            if(map.get(key) > maxCount){
                maxCount = map.get(key);
                maxElement = key;
            }
        }

        System.out.println("Element with max frequency: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}
