package Gui.Button.Control.Handler;

import Gui.Display;
import Gui.Operand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButtonHandler implements ActionListener {
    private Operand operand;
    private int control;
    private Display display;

    public ControlButtonHandler(Operand op, int control, Display display) {
        this.control = control;
        this.operand = op;
        this.display = display;
    }

    public void actionPerformed(ActionEvent e) {
        if(this.control == 0)
            this.operand.complete();

        if(this.control == 1) {
            this.operand.delete();
            this.operand.print(this.display);
        }
    }
}
