package lesson06.classWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Nemo");
        Dog dog1 = new Dog("Scooby-Doo");
        Cat cat1 = new Cat("Tom");
        Animal dragon1 = new Animal("Dragon"){
            @Override
            public String toString() {
                return String.format("Hello. I'm dragon, my name is: %s",name);
            };
        };

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(fish1);
        animals.add(dog1);
        animals.add(cat1);
        animals.add(dragon1);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).toString());
        }
        for (Animal x: animals
             ) {
            System.out.println("as animal "+x.toString());
        }
    }
}
