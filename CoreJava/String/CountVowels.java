public class CountVowels {
    public static void main(String[] args) {
        String s = "Programming";
        int count = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
