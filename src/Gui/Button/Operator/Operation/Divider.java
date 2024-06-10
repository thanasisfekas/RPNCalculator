package Gui.Button.Operator.Operation;

import Gui.Button.Operator.Operator;
import java.util.Stack;

public class Divider extends Operator {
    public Divider (Stack<Double> stack) {
        super(stack);
    }

    public void operate() {
        double num1 = this.st.pop();
        double num2 = this.st.pop();
        this.st.push((double) num2/num1);
    }
}