public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public boolean makeSound() {
        System.out.println("Vow");
        return true;
    }

    @Override
    public boolean eat() {
        return true;
    }
}
