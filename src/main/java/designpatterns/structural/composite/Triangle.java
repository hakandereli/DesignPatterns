package designpatterns.structural.composite;

public class Triangle implements Graphic{
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
