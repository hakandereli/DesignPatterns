package designpatterns.behavioural.visitor;

/**
 * @author hdereli
 * @since 9/11/2023
 */
interface Visitor {
    void visit(ConcreteElement element);
}
