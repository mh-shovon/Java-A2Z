package Practice.JavaOOP.PillerOfOop.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        AnimalClass animalClass;

        animalClass = new Dog();
        animalClass.sound();

        animalClass = new Cat();
        animalClass.sound();
    }
}
