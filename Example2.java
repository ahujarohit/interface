interface MyInterface {
    void methodOne();
    void methodTwo();
    default void methodThree() {
        System.out.println("This is default implementation of methodThree");
    }
}

class MyClass implements MyInterface {

    @Override
    public void methodOne() {
        System.out.println("This is methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is methodTwo");
    }

    // @Override
    // public void methodThree() {
    //     System.out.println("This is methodThree");
    // }
}

class Example2 {
    public static void main(String args[]) {
        MyInterface obj = new MyClass();
        obj.methodOne();
        obj.methodTwo();
        obj.methodThree();
    }
}


