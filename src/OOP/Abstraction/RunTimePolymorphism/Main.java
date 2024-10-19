package OOP.Abstraction.RunTimePolymorphism;

class RunTime{
    void name() {
        System.out.println("This first method..");
    }
}
class RunTime2 extends RunTime{
    void name() {
        System.out.println("This is second method.");
    }
}

public class Main {
    public static void main(String[] args) {
        RunTime ob = new RunTime();
        ob.name();
        RunTime ob2 = new RunTime2();
        ob2.name();
    }
}
