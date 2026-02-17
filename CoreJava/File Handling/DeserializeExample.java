import java.io.*;

public class DeserializeExample {
    public static void main(String[] args) throws Exception {

        ObjectInputStream in =
            new ObjectInputStream(new FileInputStream("student.ser"));

        Student s = (Student) in.readObject();
        in.close();

        System.out.println(s.id + " " + s.name);
    }
}
