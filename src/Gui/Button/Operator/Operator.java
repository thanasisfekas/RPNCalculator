package Gui.Button.Operator;

import java.util.Stack;

abstract public class Operator {
    protected Stack<Double> st;
    protected Operator(Stack<Double> stack)
    {
        this.st = stack;
    }
    abstract protected void operate();
}
