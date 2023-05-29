package designpatterns.creational.abstractfactory.factory;

public class FileExporterFactory {
    public static FileExporter createFileExporter(String fileType) {
        switch (fileType.toLowerCase()) {
            case "pdf":
                return new PdfExporter();
            case "csv":
                return new CsvExporter();
            case "json":
                return new JsonExporter();
            default:
                throw new IllegalArgumentException("Unsupported file type: " + fileType);
        }
    }
}