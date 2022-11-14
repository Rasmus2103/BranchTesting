public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public boolean makeSound() {
        System.out.println("Meow");
        return true;
    }

    public boolean eat(String foodType) {
        return true;
    }

    public String showMood(boolean mood) {
        if(mood == true) {
            return "Spinder";
        } else {
            return "Hvæser";
        }
    }
}
