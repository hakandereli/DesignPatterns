package designpatterns.behavioural.command.richtigeweg.commands;

import designpatterns.behavioural.command.richtigeweg.IOperation;

import java.math.BigDecimal;

/**
 * @author hdereli
 * @since 7/3/2023
 */
public class Basiscommand implements IOperation {
    @Override
    public BigDecimal operation(BigDecimal nummer1, BigDecimal nummer2) {
        return nummer1.pow(nummer2.intValue());
    }
}
