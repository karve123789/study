package calc;

public class Logic {
  public static String calculate(String a, String operator, String b){
    //если a или b римские то нам нужно преобразовать их в int
    //нужно отдать результат в той системе счисления в которой они были введены
    return "result";
  }

  public static int remakeRom(String s) {
    if (s.equals("I")) {
      System.out.println(I.getRom());
      return I.getRom();
    }
    if (s.equals("II")) {
      System.out.println(II.getRom());
      return II.getRom();
    }
    if (s.equals("III")) {
      System.out.println(III.getRom());
      return III.getRom();
    }
    if (s.equals("IV")) {
      System.out.println(IV.getRom());
      return IV.getRom();
    }
    if (s.equals("V")) {
      System.out.println(V.getRom());
      return V.getRom();
    }
    if (s.equals("VI")) {
      System.out.println(VI.getRom());
      return VI.getRom();
    }
    if (s.equals("VII")) {
      System.out.println(VII.getRom());
      return VII.getRom();
    }
    if (s.equals("VIII")) {
      System.out.println(VIII.getRom());
      return VIII.getRom();
    }
    if (s.equals("IX")) {
      System.out.println(IX.getRom());
      return IX.getRom();
    }
    if (s.equals("X")) {
      System.out.println(X.getRom());
      return X.getRom();
    } else {
      return 0;
    }
  }

  public static int calculation(int a, int b) {

    if (parseOperator("1+1").contains("+")) {
      int result = a + b;
      System.out.println(result);
      return result;
    } else
      return 0;
  }

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
    } else return "неверно";
  }

  public static void main(String[] args) {
    remakeRom("I");
    remakeRom("II");
    remakeRom("X");

    System.out.println(parseOperator("25/22"));
    calculation(25,25);

  }

}


//реализовать методы который переводит римские числа (String в инт) в инт


//реализовать метод вычисления (умножить разделить прибвить и разницу)


