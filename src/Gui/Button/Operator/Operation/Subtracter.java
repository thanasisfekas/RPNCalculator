package Gui.Button.Operator.Operation;

import Gui.Button.Operator.Operator;
import java.util.Stack;

public class Subtracter extends Operator
{
    public Subtracter(Stack<Double> stack) {
        super(stack);
    }

    public void operate() {
        double num1 = this.st.pop();
        double num2 = this.st.pop();
        this.st.push(num2-num1);
    }
}