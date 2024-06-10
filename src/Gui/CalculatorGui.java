package Gui;

import Gui.Button.Control.ControlButton;
import Gui.Button.Digit.DigitButton;
import Gui.Button.Operator.*;
import Gui.Button.Operator.Operation.*;
import javax.swing.*;
import java.awt.*;

public class CalculatorGui extends JFrame {
    private Multiplier multiplier;
    private Adder adder;
    private Divider divider;
    private Subtracter subtracter;
    private ResultPresenter result;
    private int[][] dimensionOperator = {   {400, 250, 80, 50},
                                            {400, 310, 80, 50},
                                            {400, 190, 80, 50},
                                            {400, 130, 80, 50},
                                            {400, 70, 80, 50}
                                        };
    private int[][] dimensionControl = {    {10, 310, 90, 50},
                                            {210, 310, 180, 50}
                                       };
    private Operand operand;
    private int[][] dimensionDigit = {  {110, 310, 90, 50},
                                        {10, 250, 90, 50},
                                        {110, 250, 90, 50},
                                        {210, 250, 90, 50},
                                        {10, 190, 90, 50},
                                        {110, 190, 90, 50},
                                        {210, 190, 90, 50},
                                        {10, 130, 90, 50},
                                        {110, 130, 90, 50},
                                        {210, 130, 90, 50},
                                     };
    private Display display;

    public CalculatorGui(Operand op, ResultPresenter rp, Adder ad, Subtracter sub, Multiplier mul, Divider div) {

        this.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(30, 50, 80));
        this.setSize(510, 400);
        this.setLocation(80, 200);
        this.setResizable(false);
        this.setTitle("RPNCalculator");

        this.adder = ad;
        this.multiplier = mul;
        this.divider = div;
        this.subtracter = sub;
        this.operand = op;
        this.result = rp;

        display = new Display();
        this.add(this.display);

        for (int i = 0; i < 10; i++)
            new DigitButton(i, dimensionDigit[i], this, this.operand, this.display);

        for (int i = 0; i < 5; i++)
            new OperatorButton(i, dimensionOperator[i], this,this.adder, this.multiplier,this.subtracter,this.divider, this.result, this.display);

        for(int i = 0; i < 2; i++)
            new ControlButton(i, dimensionControl[i], this, this.operand,this.display);
    }
}

