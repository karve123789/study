package calc;

import java.util.Scanner;

public class CalcPanel {

  public static void newPanel(){
    Scanner sc = new Scanner(System.in);
    // 4 + 5 или например 4 + IV
    String raw = sc.nextLine();

    // тут мы понимаем уже какой был введен оператор
    String operator = Parser.parseOperator(raw);

    //тут мы поймем какие были введены операнды
    String operand1 = Parser.parseFirstOperand(raw);

    String operand2 = Parser.parseSecondOperand(raw);

    System.out.println(Logic.calculate(operand1, operator, operand2));
  }
}
