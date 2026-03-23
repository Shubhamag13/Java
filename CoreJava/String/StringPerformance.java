public class StringPerformance {
    public static void main(String[] args) {

        String s = "Java";
        for (int i = 0; i < 1000; i++) {
            s += i;
        }

        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }

        System.out.println("Done");
    }
}
