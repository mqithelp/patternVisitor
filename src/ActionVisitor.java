public class ActionVisitor implements Visitor {
    @Override
    public void visitCat(Cat cat) {
        System.out.println("Я котик! Я важно хожу везде!");
    }

    @Override
    public void visitDog(Dog dog) {
        System.out.println("Я собака! Я бегаю за палкой!");
    }
}
