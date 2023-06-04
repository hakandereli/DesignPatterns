package designpatterns.structural.adapter;

public class SamsungTelefon implements Telefon{

    private int calismaVoltaji;

    public SamsungTelefon(){
        calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung telefon şarj ediliyor");
        return calismaVoltaji;
    }
}
