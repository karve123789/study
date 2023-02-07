package calc;


import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class Parser {
    public static String parseOperator(String message) {
//        // [+ - * /]
//        // регулярные выражения
//
//        //TODO попробовать переписать с помощью регулярок
//        if (message.contains("+")) {
//            return "+";
//        }
//
//        if (message.contains("-")) {
//            return "-";
//        }
//
//        if (message.contains("/")) {
//            return "/";
//        }
//        if (message.contains("*")) {
//            return "*";
//        }
//        else return "неверно";
        return message.replaceAll("[A-Za-z0-9]", "").trim();
    }


    public static String[] parseOperands(String str) {
        return str.split("\\s*\\+\\s*");
    }

    public static void main(String[] args) {
        String a = "4 * IV";

        // проверка метода для оператора
        System.out.print("Оператор в строке -> ");
        System.out.println(parseOperator(a));

        String[] opers = parseOperands(a);
        System.out.print("Первый операнд -> ");
        System.out.println(opers[0]);
        System.out.print("Второй операнд -> ");
        System.out.println(opers[1]);
    }
}