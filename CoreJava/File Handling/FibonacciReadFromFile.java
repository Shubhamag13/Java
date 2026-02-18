import java.io.FileReader;
import java.io.IOException;

public class FibonacciReadFromFile {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("fibonacci.txt");
            int ch;

            System.out.print("Fibonacci from file: ");

            while((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }

            fr.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
