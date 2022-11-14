public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public boolean makeSound() {
        System.out.println("Vow");
        return true;
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    public String showMood(boolean mood) {
        if(mood == true) {
            return "Logrer";
        } else {
            return "Knurrer";
        }
    }
}
