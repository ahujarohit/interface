interface InterfaceA {
    void a();
    default void methodA() {
        System.out.println("This is default methodA from InterfaceA.");
    }
}
interface InterfaceB {
    void b();
    default void methodA() {
        System.out.println("This is default methodA from InterfaceB.");
    }
}
interface InterfaceC extends InterfaceA, InterfaceB {
    void c();
    default void methodA() {
        InterfaceA.super.methodA();
        System.out.println("This is default methodA from Interface C.");
    }
}

class MyClass implements InterfaceC {
    @Override
    public void a() {
        System.out.println("a.");
    }
    @Override
    public void b() {
        System.out.println("b.");
    }
    @Override
    public void c() {
        System.out.println("c.");
    }
    @Override
    public void methodA() {
        System.out.println("This is methodA from MyClass.");
    }
}

class Example4 {
    public static void main(String args[]) {
        InterfaceA objA = new MyClass();
        objA.methodA();
    }
}





