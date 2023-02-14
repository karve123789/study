import calc.CalcPanel;
import calc.IO;
import calc.Logic;
import calc.Parser;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //создать калькулятор который принимает как римские так и арабские числа
//и умеет делать "* / + -"
    // числа только от [1 до 10] включительно
    public static void main(String[] args) {

        // ToDo допилить римские числа ну или хотя бы начать
        String message = IO.getIo();
        String operator = Parser.parseOperator(message);
        String[] operands = Parser.parseOperands(message);
        String result = Logic.calculate(operands[0], operator, operands[1]);
        System.out.println(result);

        // подчисти код, убери лишние комменты и все такое)


        // первый приоритет
        //ToDo SOLID принципы почитать;
        // Single responsibility
        // Open closed principle
        // Liskov substitution
        // Interface segregation
        // Dependency inversion
        // API почитать + Фреймворки и библиотеки -> чем отличаются и что делают
    }
}