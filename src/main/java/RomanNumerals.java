public class RomanNumerals {

    String convertDecimal(Integer decimal) {
        StringBuilder roman = new StringBuilder();
        for (RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            System.out.println(romanToDecimal);
            while (decimal >= romanToDecimal.decimal) {
                roman.append(romanToDecimal.roman);
                decimal -= romanToDecimal.decimal;
            }
        }
        return roman.toString();
    }

    enum RomanToDecimal {
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        int decimal;
        String roman;

        RomanToDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }

    }


}
