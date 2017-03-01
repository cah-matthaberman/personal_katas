import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersToWordsTest {
    private NumbersToWords subject;

    private String[] onesArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private String[] teensArray = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private String[] thousandsArray = {"zero", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"};
    private String[] teenThousandsArray = {"ten thousand", "eleven thousand", "twelve thousand", "thirteen thousand", "fourteen thousand", "fifteen thousand", "sixteen thousand", "seventeen thousand", "eighteen thousand", "nineteen thousand"};

    @Before
    public void setUp() throws Exception {
        subject = new NumbersToWords();
    }

    @Test
    public void itReturnsZeroToNine() throws Exception {
        assertNumberToWordsRange(0, 9, onesArray);
    }

    @Test
    public void itReturnsTenToNineteen() throws Exception {
        assertNumberToWordsRange(10, 19, teensArray);
    }

    @Test
    public void itReturnsTwentyToNinetyByTens() throws Exception {
        assertNumberToWordsRangeByTens(0, 90, tensArray);
    }

    @Test
    public void itReturnsTwentyOne() throws Exception {
        assertNumberToWords(21, "twenty one");
    }

    @Test
    public void itReturnsThirtyTwo() throws Exception {
        assertNumberToWords(32, "thirty two");
    }

    @Test
    public void itReturnsFortyThree() throws Exception {
        assertNumberToWords(43, "forty three");
    }

    @Test
    public void itReturnsFiftyFour() throws Exception {
        assertNumberToWords(54, "fifty four");
    }

    @Test
    public void itReturnsSixtyFive() throws Exception {
        assertNumberToWords(65, "sixty five");
    }

    @Test
    public void itReturnsSeventySix() throws Exception {
        assertNumberToWords(76, "seventy six");
    }

    @Test
    public void itReturnsEightySeven() throws Exception {
        assertNumberToWords(87, "eighty seven");
    }

    @Test
    public void itReturnsNinetyEight() throws Exception {
        assertNumberToWords(98, "ninety eight");
    }

    @Test
    public void itReturnsOneHundred() throws Exception {
        assertNumberToWords(100, "one hundred");
    }

    @Test
    public void itReturnsOneHundredFive() throws Exception {
        assertNumberToWords(105, "one hundred five");
    }

    @Test
    public void itReturnsOneHundredThirteen() throws Exception {
        assertNumberToWords(113, "one hundred thirteen");
    }

    @Test
    public void itReturnsOneHundredSixtyNine() throws Exception {
        assertNumberToWords(169, "one hundred sixty nine");
    }

    @Test
    public void itReturnsTwoHundred() throws Exception {
        assertNumberToWords(200, "two hundred");
    }

    @Test
    public void itReturnsTwoHundredNumbers() throws Exception {
        assertNumberToWords(219, "two hundred nineteen");
        assertNumberToWords(248, "two hundred forty eight");
        assertNumberToWords(299, "two hundred ninety nine");
    }

    @Test
    public void itReturnsThreeHundredNumbers() throws Exception {
        assertNumberToWords(302, "three hundred two");
        assertNumberToWords(381, "three hundred eighty one");
        assertNumberToWords(312, "three hundred twelve");
    }

    @Test
    public void itReturnsFourHundredNumbers() throws Exception {
        assertNumberToWords(402, "four hundred two");
        assertNumberToWords(481, "four hundred eighty one");
        assertNumberToWords(412, "four hundred twelve");
    }

    @Test
    public void itReturnsFiveHundredNumbers() throws Exception {
        assertNumberToWords(502, "five hundred two");
        assertNumberToWords(581, "five hundred eighty one");
        assertNumberToWords(512, "five hundred twelve");
    }

    @Test
    public void itReturnsSixHundredNumbers() throws Exception {
        assertNumberToWords(602, "six hundred two");
        assertNumberToWords(681, "six hundred eighty one");
        assertNumberToWords(612, "six hundred twelve");
    }

    @Test
    public void itReturnsSevenHundredNumbers() throws Exception {
        assertNumberToWords(702, "seven hundred two");
        assertNumberToWords(781, "seven hundred eighty one");
        assertNumberToWords(712, "seven hundred twelve");
    }

    @Test
    public void itReturnsEightHundredNumbers() throws Exception {
        assertNumberToWords(802, "eight hundred two");
        assertNumberToWords(881, "eight hundred eighty one");
        assertNumberToWords(812, "eight hundred twelve");
    }

    @Test
    public void itReturnsNineHundredNumbers() throws Exception {
        assertNumberToWords(903, "nine hundred three");
        assertNumberToWords(915, "nine hundred fifteen");
        assertNumberToWords(999, "nine hundred ninety nine");
    }

    @Test
    public void itReturnsOneThousand() throws Exception {
        assertNumberToWords(1000, "one thousand");
    }

    @Test
    public void itReturnsOneThousandToNineThousandByThousands() throws Exception {
        assertLoopBySpecificIterator(0, 9000, 1000, thousandsArray);
    }

    @Test
    public void itReturnsOneThouseOneHundredEleven() throws Exception {
        assertNumberToWords(1111, "one thousand one hundred eleven");
    }

    @Test
    public void itReturnsTenThousandThroughNineTeenThousandByThousands() throws Exception {
        assertLoopBySpecificIterator(10000, 19000, 1000, teenThousandsArray);
    }

    @Test
    public void itReturnsTwentyThousandFive() throws Exception {
        assertNumberToWords(20005, "twenty thousand five");
    }

    @Test
    public void itReturnFiveHundredTwentyFiveThousandSixHundredNineTeen() throws Exception {
        assertNumberToWords(525619, "five hundred twenty five thousand six hundred nineteen");

    }

    @Test
    @Ignore
    public void itReturnsOneMillionOne() throws Exception {
        assertNumberToWords(1000001, "one million one");
    }

    private void assertNumberToWordsRangeByTens(int startRange, int endRange, String[] expectedArray) {
        assertLoopBySpecificIterator(startRange, endRange, 10, expectedArray);
    }

    private void assertNumberToWordsRange(int startRange, int endRange, String[] expectedArray) {
        assertLoopBySpecificIterator(startRange, endRange, 1, expectedArray);
    }

    private void assertLoopBySpecificIterator(int startRange, int endRange, int iterateBy, String[] expectedArray) {
        int arrayIndex = startRange - startRange;
        for (int i = startRange; i <= endRange; i = i + iterateBy) {
            assertNumberToWords(i, expectedArray[arrayIndex]);
            arrayIndex++;
        }
    }

    private void assertNumberToWords(int number, String word) {
        assertEquals(word, subject.convert(number));
    }
}