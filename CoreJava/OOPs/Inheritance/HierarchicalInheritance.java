class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer codes");
    }
}

class Tester extends Employee {
    void test() {
        System.out.println("Tester tests");
    }
}

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        Tester t = new Tester();
        d.work();
        d.code();
        t.work();
        t.test();
    }
}
