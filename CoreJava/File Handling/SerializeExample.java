import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class SerializeExample {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(101,"Vansh");

        ObjectOutputStream out =
            new ObjectOutputStream(new FileOutputStream("student.ser"));

        out.writeObject(s1);
        out.close();

        System.out.println("Object serialized.");
    }
}
