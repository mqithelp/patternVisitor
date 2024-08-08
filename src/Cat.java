public class Cat implements Animal {
    @Override
    public void action() {
        System.out.println("Я котик! Я важно хожу везде!");
    }

    @Override
    public void sound() {
        System.out.println("Мур-мур! Мяу-Мяу!");
    }
}
