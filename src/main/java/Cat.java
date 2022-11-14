public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public boolean makeSound() {
        System.out.println("Meow");
        return true;
    }

    public boolean eat() {
        return true;
    }
}
