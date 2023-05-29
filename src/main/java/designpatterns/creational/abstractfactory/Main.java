package designpatterns.creational.abstractfactory;


import designpatterns.creational.abstractfactory.factory.FileExporter;
import designpatterns.creational.abstractfactory.factory.FileExporterFactory;

public class Main {

    public static void main(String[] args) {
        String data = "Data to be exported as CSV";
        FileExporter exporter = FileExporterFactory.createFileExporter("csv");
        exporter.export(data);
    }


}