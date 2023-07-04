package designpatterns.behavioural.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hdereli
 * @since 7/4/2023
 */
// Terminal düğümü - Belirli bir desene uyumu kontrol eden ifadeyi temsil eder
public class PatternExpression extends RegexExpression {

    private Pattern pattern;

    public PatternExpression(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean interpret(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}
