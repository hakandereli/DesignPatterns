package designpatterns.creational.abstractfactory;


import designpatterns.creational.abstractfactory.abstractfactory.CsvExporterFactory;
import designpatterns.creational.abstractfactory.abstractfactory.FileExporter;
import designpatterns.creational.abstractfactory.abstractfactory.FileExporterFactory;

public class AbstractMain {

    //Ne yapmış olduk burada switch case yazmaktan kurtardık uygulamayı her yeni tipte yeni bir factory
    //eklenerek uygulamayı soyutladık abstract factory ile her işlem için farklı factory oluşturmuş olduk.

    public static void main(String[] args) {
        String data = "Data to be exported as CSV";
        FileExporterFactory factory = new CsvExporterFactory();
        FileExporter exporter = factory.createFileExporter();
        exporter.export(data);
    }
}
