package designpatterns.behavioural.visitor;

/**
 * @author hdereli
 * @since 9/11/2023
 */
public interface Visitable {
    void accept(Visitor visitor);
}
