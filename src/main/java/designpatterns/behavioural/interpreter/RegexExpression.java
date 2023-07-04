package designpatterns.behavioural.interpreter;

/**
 * @author hdereli
 * @since 7/4/2023
 */
// Dilbilgisi ağacı düğümünü temsil eden sınıf
public abstract class RegexExpression {

    public abstract boolean interpret(String input);

}
