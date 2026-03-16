public class LongestWord {
    public static void main(String[] args) {
        String s = "Java makes backend development easy";
        String[] words = s.split(" ");

        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}
