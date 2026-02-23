class Parent {
    static void show() {
        System.out.println("Parent static show()");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static show()");
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        p.show();        // Parent version

        Parent pc = new Child();
        pc.show();       // Parent version (IMPORTANT)

        Child c = new Child();
        c.show();        // Child version
    }
}
