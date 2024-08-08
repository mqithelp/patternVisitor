public class Cat implements Animal {

    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }
}

