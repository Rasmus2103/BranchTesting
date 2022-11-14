public class Dog extends Animal{
    public void makeSound() {
        System.out.println("Vow");
    }

    @Override
    public boolean eat() {
        return true;
    }
}
