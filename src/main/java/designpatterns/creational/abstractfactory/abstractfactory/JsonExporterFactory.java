package designpatterns.creational.abstractfactory.abstractfactory;

public class JsonExporterFactory implements FileExporterFactory {
    @Override
    public FileExporter createFileExporter() {
        return new JsonExporter();
    }
}
