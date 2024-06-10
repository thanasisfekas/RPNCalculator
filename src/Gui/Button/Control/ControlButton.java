package Gui.Button.Control;

import Gui.*;
import Gui.Button.Control.Handler.ControlButtonHandler;
import javax.swing.*;
import java.awt.*;

public class ControlButton extends JButton {
    private int[] dimension;
    private int control;
    private JFrame frame;
    private Operand operand;
    private Display display;
    private String[] title = {"Enter" , "BackSpace"};
    public ControlButton(int control, int[] dimension, JFrame frame, Operand op, Display display) {
        this.control = control;
        this.dimension = dimension;
        this.frame = frame;
        this.operand= op;
        this.display = display;

        createButton(title);
    }

    private void createButton(String[] title) {
        this.setText(title[this.control]);
        this.setFont(new Font("TimesRoman", Font.PLAIN, 23));
        this.setBounds(this.dimension[0], this.dimension[1], this.dimension[2], this.dimension[3]);
        this.setBackground(Color.red);
        this.frame.add(this);
        this.addActionListener(new ControlButtonHandler(this.operand, this.control,this.display));
    }
}
