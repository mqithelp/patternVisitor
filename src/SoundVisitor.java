public class SoundVisitor implements Visitor {
@Override
    public void visitDog(Dog dog) {
        System.out.println("Гаф-гаф!");
    }
    @Override
    public void visitCat(Cat cat) {
        System.out.println("Мур-мур! Мяу-Мяу!");
    }
}