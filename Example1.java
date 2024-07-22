import java.util.Scanner;

interface EmpInterface {
    void acceptData();
    void showData();
}

class Employee implements EmpInterface {
    protected String code;
    protected String name;
    protected int basic;

    public Employee() {
        code = new String();
        name = new String();
    }

    public Employee(String code, String name, int basic) {
        this.code = code;
        this.name = name;
        this.basic = basic;
    }

    // Getters and Setters

    @Override
    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Code : ");
        code = in.nextLine();
        System.out.println("Enter Name : ");
        name = in.nextLine();
        System.out.println("Enter Basic : ");
        basic = in.nextInt();
    }

    @Override
    public void showData() {
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Basic : " + basic);
    }

    public float getHra() {
        return 0.2f * basic;
    }
}

class Example1 {
    public static void main(String args[]) {
        Employee empObj = new Employee(); //Class Reference
        empObj.acceptData();
        empObj.showData();
        System.out.println("House Rent Allowace : " + empObj.getHra());

        EmpInterface empObj1 = new Employee();  //Interface Reference
        empObj1.acceptData();
        empObj1.showData();
        // empObj1.getHra();
    }
}



