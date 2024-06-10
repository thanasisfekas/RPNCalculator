package Gui.Button.Operator;

import Gui.Button.Operator.Handler.OperatorButtonHandler;
import Gui.Button.Operator.Operation.*;

import javax.swing.*;
import java.awt.*;

public class OperatorButton extends JButton {
    private Multiplier multiplier;
    private Adder adder;
    private Divider divider;
    private Subtracter subtracter;
    private ResultPresenter result;
    private String[] operator = {"+","-","*","/","="};
    private int[] dimension;
    private JTextField field;
    private JFrame frame;

    public OperatorButton(int operator, int[] dimension, JFrame frame, Adder ad, Multiplier mul , Subtracter sub, Divider div, ResultPresenter result, JTextField field) {
        this.adder = ad;
        this.multiplier = mul;
        this.divider = div;
        this.subtracter = sub;
        this.result = result;
        this.dimension = dimension;
        this.frame = frame;
        this.field = field;

        createButton(operator);
    }

    private void createButton(int title) {
        this.setText(operator[title]);
        this.setFont(new Font("TimesRoman", Font.PLAIN, 40));
        this.setBounds(this.dimension[0], this.dimension[1], this.dimension[2], this.dimension[3]);
        this.setBackground(Color.red);
        frame.add(this);
        this.addActionListener(new OperatorButtonHandler(title, this.adder, this.multiplier, this.subtracter, this.divider, this.result, this.field));
    }
}
