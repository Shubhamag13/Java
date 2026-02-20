interface A {
    void showA();
}

interface B extends A {
    void showB();
}

class C implements B {
    public void showA() {
        System.out.println("Show A");
    }

    public void showB() {
        System.out.println("Show B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
