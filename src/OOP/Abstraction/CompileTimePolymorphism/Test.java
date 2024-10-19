package OOP.Abstraction.CompileTimePolymorphism;

interface salary {
    void insertSalary(int salary);
}

class SDE1 implements salary {
    int salary;

    @Override
    public void insertSalary(int salary) {
        this.salary = salary;
    }
    void printSalary() {
        System.out.println(this.salary);
    }
}
class SDE2 implements salary {
    int salary;
    public void insertSalary(int salary) {
        this.salary = salary;
    }
    void printSalary(){
        System.out.println(this.salary);
    }
}

public class Test {
    public static void main(String[] args) {
        SDE1 object1 = new SDE1();
        object1.insertSalary(100000);
        object1.printSalary();
        SDE2 ob2 = new SDE2();
        ob2.insertSalary(200000);
        ob2.printSalary();
    }
}
