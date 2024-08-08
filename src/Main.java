public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.action();
        cat.sound();

        dog.action();
        dog.sound();

    }
}