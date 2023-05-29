package designpatterns.creational.abstractfactory.abstractfactory;

public class PdfExporterFactory implements FileExporterFactory{
    @Override
    public FileExporter createFileExporter() {
        return new PdfExporter();
    }
}
