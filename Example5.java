import java.util.Random;

interface Constants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class MyClass implements Constants {
    public void answer() {
        int num = (int) (Math.random() * 6);
        switch(num) {
            case NO : System.out.println("Answer in No.");
                        break;
            case YES : System.out.println("Answer in Yes.");
                        break;
            case MAYBE : System.out.println("Answer in May Be.");
                        break;
            case LATER : System.out.println("Answer in Later.");
                        break;
            case SOON : System.out.println("Answer in Soon.");
                        break;
            case NEVER : System.out.println("Answer in Never.");
                        break;
        }
    }
}
class Example5 {
    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.answer();
        obj.answer();
        obj.answer();
        obj.answer();
        obj.answer();
    }
}