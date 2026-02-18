import java.io.*;

public class FileStatistics {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        int lines = 0, words = 0, chars = 0;

        while((line = br.readLine()) != null){
            lines++;
            chars += line.length();
            words += line.split(" ").length;
        }

        br.close();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
