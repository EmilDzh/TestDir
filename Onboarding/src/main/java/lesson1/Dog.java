package lesson1;

public class Dog extends Animal{


    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof");
    }
}
