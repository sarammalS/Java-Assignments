class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }

    void scratch() {
        System.out.println("Cat is scratching");
    }
}

public class InstanceCheckReal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Check the actual type of myDog before casting
        if (myDog instanceof Dog) {
            System.out.println("myDog is a Dog");
            Dog d = (Dog) myDog;  // safe cast
            d.fetch();
        }

        // Check the actual type of myCat before casting
        if (myCat instanceof Cat) {
            System.out.println("myCat is a Cat");
            Cat c = (Cat) myCat;  // safe cast
            c.scratch();
        }

        // Check if myAnimal is an instance of Dog
        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is a Dog");
        } else {
            System.out.println("myAnimal is NOT a Dog");
        }
    }
}
