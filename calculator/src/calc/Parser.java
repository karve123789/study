package calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
  private static int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static String[] rimDigits = {"I", "II", "III", "IV"};

  public static String parseOperator(String message) {
    // [+ - * /]
    // регулярные выражения

    //TODO попробовать переписать с помощью регулярок
    if (message.contains("+")) {
      return "+";
    }

    if (message.contains("-")) {
      return "-";
    }

    if (message.contains("/")) {
      return "/";
    }
    if (message.contains("*")) {
      return "*";
    }
    return null;
  }

  public static String[] parseOperands(String message) {
    //TODO реализовать парсинг операндов // ГОТОВО

    //TODO осознать код, поиграться
    //комментарий к методу parseOperator(аргумент)
    //наша тестовая строка
    String str = "    42-   12";
    str = str.replaceAll(" ", "");
    // эта регулярка, которую мы нашли
    // закидывает все числа в массив
    // теперь мы можем доставать числа
    String[] arr = str.split("[^0-9]");
    return arr;
  }

  public static String[] parseRomanOperands(String message) {
    String strR = " V   * III   ";
    strR = strR.replaceAll(" ", "");
    String[] arrR = strR.split("[^A-Z]");
    return arrR;
  }


  public static void main(String[] args) {
    //комментарий к методу parseOperator(аргумент)
    //наша тестовая строка
    String str = "    42-   12";
   str = str.replaceAll(" ", "");
    // эта регулярка, которую мы нашли
    // закидывает все числа в массив
    // теперь мы можем доставать числа
    String[] arr = str.split("[^0-9]");

    //в цикле выводится все элементы массива
    for (int i = 0; i < arr.length; i++) {
     System.out.println(arr[i]);
    }
    System.out.println("rom");
    //

    String strR = " V   * III ";
    strR = strR.replaceAll(" ", "");
    String[] arrR = strR.split("[^A-Z]");
    for (int i = 0; i < arrR.length; i++) {
      System.out.println(arrR[i]);


    }
  }
}
