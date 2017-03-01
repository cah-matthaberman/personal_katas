
public class NumbersToWords {
    private String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private String[] tens = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private String[] identifiers = {" thousand", " million", " billion"};
    private int place = 0;

    public String convert(int number) {
        return number < 1000 ? convertLessThanOneThousand(number) : convertThousands(number);
    }

    private String convertThousands(int number) {
        return getThousandsString(number) + recursiveConvert(number, 1000);
    }

    private String getThousandsString(int number) {
        return convert(number / 1000) + identifiers[place];
    }

    private String convertLessThanOneThousand(int number) {
        return number < 100 ? convertLessThanOneHundred(number) : convertHundreds(number);
    }

    private String convertHundreds(int number) {
        return getHundredString(number) + recursiveConvert(number, 100);
    }

    private String getHundredString(int number) {
        return ones[number / 100] + " hundred";
    }

    private String recursiveConvert(int number, int modulusBy) {
        int remainders = number % modulusBy;
        return remainders != 0 ? " " + convert(remainders) : "";
    }

    private String convertLessThanOneHundred(int number) {
        return number < 20 ? convertLessThanTwenty(number) : convertTens(number);
    }

    private String convertTens(int number) {
        return tens[number / 10] + addOnesToString(number);
    }

    private String addOnesToString(int number) {
        int onesPlace = number % 10;
        return onesPlace != 0 ? " " + ones[onesPlace] : "";
    }

    private String convertLessThanTwenty(int number) {
        return number < 10 ? ones[number] : teens[number % 10];
    }
}
