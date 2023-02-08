package calc;

import static calc.util.Romnumber.*;

public class Logic {
  public static String calculate(String a, String operator, String b){
    //ToDo Наш парсер уже умеет отдавать операнды и оператор  "parseOperands(str)" и "parseOperator(message)"
    // использовать их тут не нужно они будут вызваны в классе оркестраторе
    // твоя задача именно реализовать логику в входными данными в параметрах метода "(String a, String operator, String b)"
    // где каждый операнд это стринга которая может быть как арабской так и римской
    // что то типа if(операнд1 == число && операнд2 == число) {преобразовать из стринг в инт и тупа сложить взяв оператор опять же из аругента в параметрах этого метода}
    // если же это арабские это будет else где нужно сделать пока заглушку которая будет (псевдо)переводить числа в арабские
    return "result";
  }

  // TODO: эту логику тут не нужно, вынести в другой класс
//  public static int remakeRom(String s) {
//    if (s.equals("I")) {
//      System.out.println(I.getRom());
//      return I.getRom();
//    }
//    if (s.equals("II")) {
//      System.out.println(II.getRom());
//      return II.getRom();
//    }
//    if (s.equals("III")) {
//      System.out.println(III.getRom());
//      return III.getRom();
//    }
//    if (s.equals("IV")) {
//      System.out.println(IV.getRom());
//      return IV.getRom();
//    }
//    if (s.equals("V")) {
//      System.out.println(V.getRom());
//      return V.getRom();
//    }
//    if (s.equals("VI")) {
//      System.out.println(VI.getRom());
//      return VI.getRom();
//    }
//    if (s.equals("VII")) {
//      System.out.println(VII.getRom());
//      return VII.getRom();
//    }
//    if (s.equals("VIII")) {
//      System.out.println(VIII.getRom());
//      return VIII.getRom();
//    }
//    if (s.equals("IX")) {
//      System.out.println(IX.getRom());
//      return IX.getRom();
//    }
//    if (s.equals("X")) {
//      System.out.println(X.getRom());
//      return X.getRom();
//    } else {
//      return 0;
//    }
//  }

//  public static int calculation(int a, int b) {
//
//    if (parseOperator("1+1").contains("+")) {
//      int result = a + b;
//      System.out.println(result);
//      return result;
//    } else
//      return 0;
//  }
  //ToDo этот метод удалиьт он уже реализова в парсере
//  public static String parseOperator(String message) {
//    // [+ - * /]
//    // регулярные выражения
//
//    //TODO попробовать переписать с помощью регулярок
//    if (message.contains("+")) {
//      return "+";
//    }
//
//    if (message.contains("-")) {
//      return "-";
//    }
//
//    if (message.contains("/")) {
//      return "/";
//    }
//    if (message.contains("*")) {
//      return "*";
//    } else return "неверно";
//  }

  //мэйн для тестов оставил, будет нужен
//  public static void main(String[] args) {
//    remakeRom("I");
//    remakeRom("II");
//    remakeRom("X");
//
//    System.out.println(parseOperator("25/22"));
//    calculation(25,25);
//
//  }

  public static int mock(String str){
    // Метод заглушка который принимает стрингу например "V" и возвращает 5 как инт
    // нужен для того что бы пока не реализовывать перевод из арабских в римские
    return 5;
  }

}


//реализовать методы который переводит римские числа (String в инт) в инт


//реализовать метод вычисления (умножить разделить прибвить и разницу)


