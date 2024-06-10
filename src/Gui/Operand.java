package Gui;

import javax.swing.*;
import java.util.Stack;

public class Operand {
    private Stack<Double> st;
    private StringBuffer strb = new StringBuffer();

    public Operand(Stack<Double> st)
    {
        this.st = st;
    }

    public void addDigit(int val) {
        strb.append(val);
    }

    public void complete() {
        this.st.push(Double.parseDouble(strb.toString()));
        strb.setLength(0);
        System.out.println();
    }

    public void delete()
    {
        strb.deleteCharAt((strb.length() - 1));
    }

    public void print(JTextField field)
    {
        field.setText(strb.toString());
    }
}