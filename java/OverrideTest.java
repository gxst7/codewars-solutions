public class OverrideTest {
    
    public static void main(String[] args) {
        
    }
}

class A {

    void f() {
        System.out.println("A");
    }
}

class B extends A {

    // Overriding method must have the same signature as a parent method (return type + method name + arguments)
    @Override
    void f() {
        System.out.println("B");
    }
}
