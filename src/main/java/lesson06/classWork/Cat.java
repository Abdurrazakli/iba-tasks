package lesson06.classWork;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Hello. I'm cat, my name is: %s",name);
    }
}
