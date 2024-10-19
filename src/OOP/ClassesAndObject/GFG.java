package OOP.ClassesAndObject;

public class GFG {
    static String Employee_name;
    static float Employee_salary;

    static void set(String name, float salary) {
        Employee_name = name;
        Employee_salary = salary;
    }

    static void get() {
        System.out.println("Employee name is: " + Employee_name);
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String[] args) {
        GFG.set("Rahul Dravid", 100000.0f); // object
        GFG.get();
    }
}
