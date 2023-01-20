package calc;

import java.util.Scanner;

public class CalcPanel {

  public static void newPanel(){
    Scanner sc = new Scanner(System.in);
    // 4 + 5 или например 4 + IV
      String raw = sc.nextLine();

    // тут мы понимаем уже какой был введен оператор
    String operator = Parser.parseOperator(raw);

    Logic.calculate(Parser.parseOperands(raw)[0], Parser.parseOperator(raw), Parser.parseOperands(raw)[1]);
  }
}
