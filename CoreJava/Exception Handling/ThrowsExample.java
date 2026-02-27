import java.io.IOException;

public class ThrowsExample {
    static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}
