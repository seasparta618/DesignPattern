package patterns.InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable variable, Integer value){
        this.map.put(variable, value);
    }

    public int getValue(Variable var){
        return map.get(var);
    }
}
