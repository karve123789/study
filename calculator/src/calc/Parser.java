package calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
  private static int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static String[] rimDigits = {"I", "II", "III", "IV"};
  public static String parseOperator(String message){
    // [+ - * /]
    // регулярные выражения
    Pattern pt1 = Pattern.compile("d");
    Pattern pt2 =Pattern.compile("I,II,III,IV,VI,VII,VIII,IX,X");
    Matcher m1= pt1.matcher(message);//нужно считать со сканера
    Matcher m2 = pt2.matcher(message);
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
