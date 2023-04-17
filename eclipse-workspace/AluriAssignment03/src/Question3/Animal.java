package Question3;

class Animal {
    public Animal getAnimal() {
        return new Animal();
    }
}
class Dog extends Animal {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}
class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog)animal.getAnimal();
        System.out.println(dog.getClass());
    }
}

