package designpatterns.behavioural.command.richtigeweg;

import java.math.BigDecimal;

/**
 * @author hdereli
 * @since 7/3/2023
 */
public interface IOperation {
    BigDecimal operation(BigDecimal nummer1, BigDecimal nummer2);
}
