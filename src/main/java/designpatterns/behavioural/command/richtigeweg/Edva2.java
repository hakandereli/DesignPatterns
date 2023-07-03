package designpatterns.behavioural.command.richtigeweg;

import java.math.BigDecimal;

/**
 * @author hdereli
 * @since 7/3/2023
 */
public class Edva2 {

    public static BigDecimal operation(IOperation iOperation, BigDecimal nummer1, BigDecimal nummer2) {

        BigDecimal abschluss = iOperation.operation(nummer1, nummer2);
        return abschluss;
    }
}
