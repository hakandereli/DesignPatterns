package designpatterns.creational.factory;

public interface FileExporter {

    //Örnek olması için sadece String döndüm File objesi de olabilirdi.
    String export(String content);
}
