package designpatterns.creational.abstractfactory.abstractfactory;

public class JsonExporter implements FileExporter {
    @Override
    public void export(String data) {
        System.out.println("Exporting data to JSON file");
        // JSON dosyasına veri aktarımı yapılır.
    }
}
