package designpatterns.creational.abstractfactory.abstractfactory;

public class CsvExporterFactory implements FileExporterFactory{
    @Override
    public FileExporter createFileExporter() {
        return new CsvExporter();
    }
}
