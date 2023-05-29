package designpatterns.creational.factory;

//Public i kaldırdım bu paket özelinde erişilebilecek bu class a başka package lar erişemesin.
class ExcelExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "EXCEL -> " + content;
    }
}
