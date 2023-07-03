package designpatterns.behavioural.command;

import designpatterns.behavioural.command.falsceweg.Edva;
import designpatterns.behavioural.command.falsceweg.enums.Operationstyp;
import designpatterns.behavioural.command.richtigeweg.Edva2;
import designpatterns.behavioural.command.richtigeweg.commands.*;

import java.math.BigDecimal;

/**
 * @author hdereli
 * @since 7/3/2023
 */
public class App2 {

    public static void main(String[] args) {

        BigDecimal nummer1 = BigDecimal.TEN;
        BigDecimal nummer2 = BigDecimal.valueOf(2);

        BigDecimal gesamt = Edva2.operation(new Additioncommand(), nummer1, nummer2);
        BigDecimal differenz = Edva2.operation(new Subtraktioncommand(), nummer1, nummer2);
        BigDecimal einmaleins = Edva2.operation(new Multiplikationcommand(), nummer1, nummer2);
        BigDecimal devide = Edva2.operation(new Divisioncommand(), nummer1, nummer2);
        BigDecimal base = Edva2.operation(new Basiscommand(), nummer1, nummer2);
        BigDecimal mod = Edva2.operation(new Moddingcommand(), nummer1, nummer2);


        System.out.println("GESAMT : " + gesamt);
        System.out.println("DIFFERENZ : " + differenz);
        System.out.println("EINMALEINS : " + einmaleins);
        System.out.println("DEVIDE : " + devide);
        System.out.println("BASE : " + base);
        System.out.println("MOD : " + mod);
    }
}
