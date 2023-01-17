package calc;

public class Parser {
  private static int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static String[] rimDigits = {"I", "II", "III", "IV"};
  public static String parseOperator(String message){
    // [+ - * /]
    // регулярные выражения
    if(message.contains("+")){
      return "+";
    }

    if(message.contains("-")){
      return "-";
    }

    if(message.contains("/")){
      return "/";
    }
    if (message.contains("*")){
      return "*";
    }
    return null;
  }

  public static String parseFirstOperand(String message){
    //TODO реализовать парсинг первого операнда
    return null;
  }

  public static String parseSecondOperand(String message){
    //TODO реализовать парсинг второго операнда
    return null;
  }
}
