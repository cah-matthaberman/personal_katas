import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersToRomanNumeralsTest {
    private NumbersToRomanNumerals subject;

    @Before
    public void setUp() throws Exception {
        subject = new NumbersToRomanNumerals();
    }

    @Test
    public void itReturnsI() throws Exception {
        assertNumberToRoman(1, "I");
    }

    @Test
    public void itReturnsV() throws Exception {
        assertNumberToRoman(5, "V");
    }

    @Test
    public void itReturnsX() throws Exception {
        assertNumberToRoman(10, "X");
    }

    @Test
    public void itReturnsL() throws Exception {
        assertNumberToRoman(50, "L");
    }

    @Test
    public void itReturnsC() throws Exception {
        assertNumberToRoman(100, "C");
    }

    @Test
    public void itReturnsD() throws Exception {
        assertNumberToRoman(500, "D");
    }

    @Test
    public void itReturnsM() throws Exception {
        assertNumberToRoman(1000, "M");
    }

    @Test
    public void itReturnsII() throws Exception {
        assertNumberToRoman(2, "II");
    }

    @Test
    public void itReturnsIII() throws Exception {
        assertNumberToRoman(3, "III");
    }

    @Test
    public void itReturnsIV() throws Exception {
        assertNumberToRoman(4, "IV");
    }

    @Test
    public void itReturnsVI() throws Exception {
        assertNumberToRoman(6, "VI");
    }

    @Test
    public void itReturnsVII() throws Exception {
        assertNumberToRoman(7, "VII");
    }

    @Test
    public void itReturnsVIII() throws Exception {
        assertNumberToRoman(8, "VIII");
    }

    @Test
    public void itReturnsIX() throws Exception {
        assertNumberToRoman(9, "IX");
    }

    @Test
    public void itReturnsXI() throws Exception {
        assertNumberToRoman(11, "XI");
    }

    @Test
    public void itReturnsXII() throws Exception {
        assertNumberToRoman(12, "XII");
    }

    @Test
    public void itReturnsXIV() throws Exception {
        assertNumberToRoman(14, "XIV");
    }

    private void assertNumberToRoman(int number, String expected) {
        assertEquals(expected, subject.convert(number));
    }
}