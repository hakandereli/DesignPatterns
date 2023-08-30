package designpatterns.structural.composite;

public class Main {

    /**
     *
     * Composite tasarım kalıbı, nesne yönelimli programlamada kullanılan bir tasarım desenidir.
     * Bu desen, bir nesnenin iç içe geçmiş hiyerarşik yapılarda bulunan diğer nesnelerle aynı şekilde davranmasını ve bunları bir bütün olarak yönetmeyi sağlar.
     * Yani, tekil nesneler ve bunların grupları (kompozitler) arasındaki hiyerarşiyi yönetmek için kullanılır.
     * Genellikle ağaç yapıları oluşturmak veya nesneleri hiyerarşik olarak düzenlemek için kullanışlıdır.
     *
     * Composite tasarım kalıbı, özellikle aynı türden nesnelerin hiyerarşik olarak düzenlendiği durumlarda kullanışlıdır.
     * Bu desenin amacı, tekil nesneleri ve bu nesnelerin kompozitleri (grupları) kullanarak birlikte çalışabilir ve aynı şekilde davranabilir hale getirmektir.
     * Bu sayede istemci kodu, tekil nesnelerle veya bu nesnelerin gruplarıyla çalışırken fark etmeden aynı arabirimleri kullanabilir.
     *
     *
     * */


    public static void main(String[] args) {
        // Create leaf objects
        Circle circle = new Circle();
        Triangle triangle = new Triangle();


        // Create a composite object
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle);
        composite.add(triangle);

        // Draw individual leaf and composite
        circle.draw();
        triangle.draw();

        System.out.println("--------------");

        // Draw the composite, treating it as a single object
        composite.draw();

    }
}
