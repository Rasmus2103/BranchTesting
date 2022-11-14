public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Chloe");


        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
