//MULTI LEVEL INHERITENCE

class Animal {
    void makeSound() {
        System.out.println("Sound");
    }
}

class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Giving Birth!!");
    }
}

class Dog extends Mammal {
    @Override
    void makeSound() {
        System.out.println("WOOF!!");
    }
}

public class q5inheritence {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.makeSound();

        Mammal mam = new Mammal();
        mam.makeSound();
        mam.giveBirth();

        Dog d = new Dog();
        d.makeSound();
        d.giveBirth();

    }

}
