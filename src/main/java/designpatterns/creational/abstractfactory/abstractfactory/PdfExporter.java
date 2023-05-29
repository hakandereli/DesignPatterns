package designpatterns.creational.abstractfactory.abstractfactory;

public class PdfExporter implements FileExporter {
    @Override
    public void export(String data) {
        System.out.println("Exporting data to PDF file");
        // PDF dosyasına veri aktarımı yapılır.
    }
}
