class Parent {

    String name = "Parent";

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show method");
    }
}

public class Child extends Parent {

    String name = "Child";

    Child() {
        super(); // calls Parent constructor
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("Child show method");
        super.show(); // calls Parent method
    }

    void printName() {
        System.out.println(name);       // Child variable
        System.out.println(super.name); // Parent variable
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.printName();
    }
}
