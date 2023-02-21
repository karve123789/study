package calc.util;

import java.util.HashMap;
import java.util.Map;

public class ArabNumberMap {

    public static Map<Integer, String> getDictionary() {
        Map<Integer, String> map = new  HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        return map;
    }
        public static void main(String[] args) {
                System.out.println(getDictionary().get(9));
        }

}
