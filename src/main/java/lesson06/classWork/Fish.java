package lesson06.classWork;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Hello. I'm fish, my name is: %s",name);
    }
}
