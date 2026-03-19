public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String s = "Ja@va#123!";
        String result = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(result);
    }
}
