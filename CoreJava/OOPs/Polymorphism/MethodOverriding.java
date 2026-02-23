class Parent {
    void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class show method");
    }

    public static void main(String[] args) {
        Parent p = new Child();   // upcasting
        p.show();
    }
}
