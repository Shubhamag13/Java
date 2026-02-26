public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
