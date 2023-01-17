import calc.CalcPanel;
import calc.Parser;
import java.util.Scanner;

public class Main {
    //создать калькулятор который принимает как римские так и арабские числа
//и умеет делать "* / + -"
    // числа только от [1 до 10] включительно
    public static void main(String[] args) {
//    CalcPanel.newPanel();
        String str = " 4- V";
        System.out.println(Parser.parseOperator(str));
    }
}