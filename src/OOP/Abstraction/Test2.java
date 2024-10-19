package OOP.Abstraction;

abstract class Animal{
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public String getName() {
        return name;
    }
}

// Abstract class
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Fluffy");

        myDog.makeSound();
        myCat.makeSound();
    }
}
