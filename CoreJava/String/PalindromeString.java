public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println(s.equals(rev));
    }
}
