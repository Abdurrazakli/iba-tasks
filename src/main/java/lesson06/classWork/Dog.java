package lesson06.classWork;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Hello. I'm dog, my name is: %s",name);
    }
}
