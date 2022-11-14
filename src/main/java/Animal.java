public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean makeSound();

    public abstract boolean eat(String foodType);
}
