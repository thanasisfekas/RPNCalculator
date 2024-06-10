package Gui.Button.Operator.Handler;

import Gui.Button.Operator.Operation.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorButtonHandler implements ActionListener {
    private Multiplier multiplier;
    private Adder adder;
    private Divider divider;
    private Subtracter subtracter;
    private ResultPresenter result;
    private int title;
    private JTextField field;

    public OperatorButtonHandler(int title, Adder ad, Multiplier mul , Subtracter sub, Divider div, ResultPresenter result, JTextField field) {
        this.adder = ad;
        this.multiplier = mul;
        this.subtracter = sub;
        this.divider  = div;
        this.title = title;
        this.result = result;
        this.field = field;
    }

    public void actionPerformed(ActionEvent e) {
        if(this.title == 0)
            this.adder.operate();

        if(this.title == 1)
            this.subtracter.operate();

        if(this.title == 2)
            this.multiplier.operate();

        if(this.title == 3)
            this.divider.operate();

        if(this.title == 4)
            this.result.result(this.field);
    }
}
