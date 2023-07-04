package designpatterns.behavioural.interpreter;

/**
 * @author hdereli
 * @since 7/5/2023
 */
// Yorumlayıcı sınıf
public class RegexInterpreter {

    private RegexExpression expression;

    public RegexInterpreter(RegexExpression expression) {
        this.expression = expression;
    }

    public boolean interpret(String input) {
        return expression.interpret(input);
    }
}
