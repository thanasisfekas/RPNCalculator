package Gui.Button.Digit.Handler;

import Gui.Display;
import Gui.Operand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonHandler implements ActionListener {
    private int title;
    private Operand operand;
    private Display display;

    public DigitButtonHandler(int title, Operand op, Display display) {
        this.title = title;
        this.operand = op;
        this.display = display;
    }

    public void actionPerformed(ActionEvent e) {
        operand.addDigit(this.title);
        this.operand.print(this.display);
    }
}
