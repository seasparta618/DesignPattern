package patterns.InterpreterPattern;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");

        Variable c = new Variable("c");

        Variable d = new Variable("d");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        //a - ((d - b) + c)
        AbstractExpression expression = new Minus(a, new Plus(new Minus(d, b), c));
        int interpret = expression.interpret(context);
        System.out.println(expression + " = " + interpret);
    }
}
