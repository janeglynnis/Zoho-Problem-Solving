class Animal {
    protected void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        sound(); // Accessible
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
