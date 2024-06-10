package Gui.Button.Operator.Operation;

import Gui.Button.Operator.Operator;
import java.util.Stack;

public class Multiplier extends Operator {
    public Multiplier(Stack<Double> stack) {
        super(stack);
    }

    public void operate() {
        this.st.push(this.st.pop() * this.st.pop());
    }
}