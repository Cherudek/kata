import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {


    RomanNumerals SUT = new RomanNumerals();

    @Test
    void itConvertsIntegerToRoman(){
        assertEquals("I", SUT.convertDecimal(1));
        assertEquals("II", SUT.convertDecimal(2));
        assertEquals("III", SUT.convertDecimal(3));
        assertEquals("IV", SUT.convertDecimal(4));
        assertEquals("V", SUT.convertDecimal(5));
        assertEquals("VI", SUT.convertDecimal(6));
        assertEquals("VII", SUT.convertDecimal(7));
        assertEquals("VIII", SUT.convertDecimal(8));
        assertEquals("IX", SUT.convertDecimal(9));
        assertEquals("X", SUT.convertDecimal(10));
        assertEquals("XI", SUT.convertDecimal(11));
        assertEquals("XII", SUT.convertDecimal(12));
        assertEquals("XIII", SUT.convertDecimal(13));
        assertEquals("XIV", SUT.convertDecimal(14));
        assertEquals("XV", SUT.convertDecimal(15));
        assertEquals("XVI", SUT.convertDecimal(16));
        assertEquals("XVII", SUT.convertDecimal(17));
        assertEquals("XVIII", SUT.convertDecimal(18));

        assertEquals("XX", SUT.convertDecimal(20));
        assertEquals("XXI", SUT.convertDecimal(21));
        assertEquals("XXIII", SUT.convertDecimal(23));
        assertEquals("XXVIII", SUT.convertDecimal(28));
        assertEquals("XXX", SUT.convertDecimal(30));
        assertEquals("XL", SUT.convertDecimal(40));
        assertEquals("MMXXI", SUT.convertDecimal(2021));


    }



}