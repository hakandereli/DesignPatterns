package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{

    private List<Graphic> graphicList = new ArrayList<>();

    public void add(Graphic graphic){
        graphicList.add(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a composite graphic:");
        for (Graphic graphic : graphicList) {
            graphic.draw();
        }

    }
}
