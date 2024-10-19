package OOP.Abstraction.CompileTimePolymorphism;

class First {
    void check() {
        System.out.println("This is the first class.");
    }
}
class Second extends First {
    void check(String name) {
        System.out.println("This is " + name + " class.");
    }
}
public class Main {
    public static void main(String[] args) {
        Second ob = new Second();
        ob.check("second");

        First ob1 = new First();
        ob.check();

        First ob2 = new Second();
        ob.check();
    }
}
