public class ToggleCase {
    public static void main(String[] args) {
        String s = "JaVa";
        String result = "";

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else
                result += Character.toUpperCase(c);
        }

        System.out.println(result);
    }
}
