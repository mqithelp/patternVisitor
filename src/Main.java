public class Main {
    public static void main(String[] args) {
// Вся суть паттерна Посититель -- не меняя классов Dog и Cat добавлять им функционал!

        Animal cat = new Cat();
        Animal dog = new Dog();

        Visitor soundVisitor = new SoundVisitor();
        Visitor actionVisitor = new ActionVisitor();

        cat.accept(soundVisitor);
        cat.accept(actionVisitor);

        dog.accept(soundVisitor);
        dog.accept(actionVisitor);

    }
}