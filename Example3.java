interface MyInterface {
    private void reusableMethod() {
        System.out.println("This is some reusable logic");
    }
    
    default void myMethod() {
        reusableMethod();
    }

    static void staticMethod() {
        System.out.println("This is a static method");
    }
}

class Example3 implements MyInterface {
    public static void main(String args[]) {
        MyInterface obj = new Example3();
        obj.myMethod();
        MyInterface.staticMethod();
    }
}