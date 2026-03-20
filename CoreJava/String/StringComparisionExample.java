public class StringComparisonExample {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);      // true
        System.out.println(s1 == s3);      // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}
