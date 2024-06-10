import Gui.Button.Operator.Operation.*;
import Gui.CalculatorGui;
import Gui.Operand;
import java.util.*;

public class RPNCalculator {
    public static void main(String[] args) {
        var stack = new Stack<Double>();
        new CalculatorGui(new Operand(stack), new ResultPresenter(stack), new Adder(stack), new Subtracter(stack), new Multiplier(stack), new Divider(stack));
    }
}