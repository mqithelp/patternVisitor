public class Dog implements Animal {


    @Override
    public void accept(Visitor visitor) {
        visitor.visitDog(this);
    }
}
