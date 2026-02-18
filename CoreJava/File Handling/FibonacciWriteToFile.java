import java.io.FileWriter;
import java.io.IOException;

public class FibonacciWriteToFile {
    public static void main(String[] args) {

        int n = 10; // number of Fibonacci terms
        int a = 0, b = 1;

        try {
            FileWriter fw = new FileWriter("fibonacci.txt");

            for(int i = 1; i <= n; i++){
                fw.write(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }

            fw.close();
            System.out.println("Fibonacci series written to file successfully.");

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
