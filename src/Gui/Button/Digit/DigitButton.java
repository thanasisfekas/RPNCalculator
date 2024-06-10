package Gui.Button.Digit;

import Gui.Button.Digit.Handler.DigitButtonHandler;
import Gui.Display;
import Gui.Operand;
import javax.swing.*;
import java.awt.*;

public class DigitButton extends JButton{

    private int title;
    private int[] dimension;
    private Operand operand;
    private JFrame frame;
    private Display display;

    public DigitButton(int title, int[] dimension, JFrame frame, Operand op, Display display) {
        this.title = title;
        this.dimension = dimension;
        this.frame = frame;
        this.operand = op;
        this.display = display;

        createButton(title);
    }

    private void createButton(int title) {
        this.setText(Integer.toString(title));
        this.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        this.setBounds(this.dimension[0], this.dimension[1], this.dimension[2], this.dimension[3]);
        this.setBackground(Color.red);
        this.frame.add(this);
        this.addActionListener(new DigitButtonHandler(this.title, this.operand, this.display));
    }
}
