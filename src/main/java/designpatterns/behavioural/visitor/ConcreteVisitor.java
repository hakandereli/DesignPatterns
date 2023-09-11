package designpatterns.behavioural.visitor;

/**
 * @author hdereli
 * @since 9/11/2023
 */
class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElement element) {
        int squaredData = element.getData() * element.getData();
        System.out.println("ConcreteVisitor işlem sonucu: " + squaredData);
    }
}
