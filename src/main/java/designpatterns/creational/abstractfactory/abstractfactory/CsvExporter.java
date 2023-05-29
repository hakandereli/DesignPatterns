package designpatterns.creational.abstractfactory.abstractfactory;

public class CsvExporter implements FileExporter {
    @Override
    public void export(String data) {
        System.out.println("Exporting data to CSV file");
        // CSV dosyasına veri aktarımı yapılır.
    }
}