import java.util.HashMap;

public class NumbersToRomanNumerals {

    private HashMap<Integer, String> numeralMap = new HashMap<Integer, String>();

    public String convert(int number) {
        initMap();
        return numeralMap.get(number) != null ? numeralMap.get(number) : getComplexNumber(number);
    }

    private String getComplexNumber(int number) {
        String ret = "";
        int remainder = number % 5;
        int divided = number / 5;
        if (remainder == 4) {
            ret = numeralMap.get(1) + numeralMap.get(5 * (divided + 1));
        } else {
            ret += numeralMap.get(5 * divided);
            for (int i = 0; i < remainder; i++) {
                ret += numeralMap.get(1);
            }
        }

        return ret;
    }

    private void initMap() {
        numeralMap.put(0, "");
        numeralMap.put(1, "I");
        numeralMap.put(5, "V");
        numeralMap.put(10, "X");
        numeralMap.put(50, "L");
        numeralMap.put(100, "C");
        numeralMap.put(500, "D");
        numeralMap.put(1000, "M");
    }
}
