package designpatterns.behavioural.command.falsceweg;

import designpatterns.behavioural.command.falsceweg.enums.Operationstyp;

import java.math.BigDecimal;

/**
 * @author hdereli
 * @since 7/3/2023
 */
// EDVA almanca da hesap makinesinin kısaltmasıdır. Tam adı ise Taschenrechner dir.
//Almanca çalıştığım için bu isimleri tercih ettim.
public class Edva {

    public static BigDecimal operation(Operationstyp operationstyp, BigDecimal nummer1, BigDecimal nummer2){

        BigDecimal abschluss = BigDecimal.ZERO;

        if (Operationstyp.ADDITION.equals(operationstyp)){
            //Ekleme
            abschluss = nummer1.add(nummer2);
        }
        else if (Operationstyp.SUBTRAKTION.equals(operationstyp)){
            //Çıkarma
            abschluss = nummer1.subtract(nummer2);
        }
        else if (Operationstyp.MULTIPLIKATION.equals(operationstyp)){
            //Çarpma
            abschluss = nummer1.multiply(nummer2);
        }
        else if (Operationstyp.DIVISION.equals(operationstyp)){
            //Bölme
            abschluss = nummer1.divide(nummer2);
        }
        else if (Operationstyp.BASIS.equals(operationstyp)){
            //Üs Alma
            abschluss = nummer1.pow(nummer2.intValue());
        }
        else if (Operationstyp.MODDING.equals(operationstyp)){
            //Mod Alma
            abschluss = nummer1.remainder(nummer2);
        }

        return abschluss;
    }
}
