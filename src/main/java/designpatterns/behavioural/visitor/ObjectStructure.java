package designpatterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hdereli
 * @since 9/11/2023
 */
public class ObjectStructure {
    private List<Visitable> elements = new ArrayList<>();

    public void addElement(Visitable element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Visitable element : elements) {
            element.accept(visitor);
        }
    }
}
