package calc;

import java.util.Scanner;

public class IO {
    public static String getIo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение -> ");
        return sc.nextLine();
    }
}
