package Gui.Button.Operator.Operation;

import javax.swing.*;
import java.util.Stack;

public class ResultPresenter {
    private Stack<Double> st;

    public ResultPresenter(Stack<Double> stack) {
        this.st = stack;
    }

    public void result(JTextField fl) {
        fl.setText(this.st.pop().toString());
    }
}