public class Dog implements Animal {

    @Override
    public void action() {
        System.out.println("Я собака! Я бегаю за палкой!");
    }

    @Override
    public void sound() {
        System.out.println("Гаф-гаф!");
    }
}
