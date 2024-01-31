package designpatterns.behavioural.visitor;

/**
 * @author hdereli
 * @since 9/11/2023
 */
public class ConcreteElement implements Visitable {

    private int data;

    public ConcreteElement(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
