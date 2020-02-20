package lesson06.classWork;

public class Animal {
    String name;
    public Animal(String name){
        this.name = String.format("\"%s\"",name.toUpperCase());
    }
    @Override
    public String toString(){
        return String.format("Hello. I'm animal, my name is: %s",name);
    }
}
