class Student {
    int id;
    String name;

    Student(int i, String n) {   // parameterized constructor
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Vansh");
        s1.display();
    }
}
