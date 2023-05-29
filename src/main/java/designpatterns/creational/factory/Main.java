package designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {

        String excelDosyasi = FileExporterFactory.getInstance(FileType.EXCEL).export("Excel Verisi");
        System.out.println(excelDosyasi);

        String pdfDosyasi = FileExporterFactory.getInstance(FileType.PDF).export("PDF Verisi");
        System.out.println(pdfDosyasi);
    }
}