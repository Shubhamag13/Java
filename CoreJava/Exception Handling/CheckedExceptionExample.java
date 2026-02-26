import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file.txt");
    }
}
