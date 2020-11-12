package sample.service;

public final class Validator {

    public static boolean isRomanNumber(String romanNumber)
    {
        if (!romanNumber.isEmpty())
        {
            /* Regex
            M{0,4} thousands section 0 to 4000
            (CM|CD|D?C{0,3}) hundreds section with all possibilities
            (XC|XL|L?X{0,3}) tens section with all possibilties
            (IX|IV|V?I{0,3}) units 0 to 9
             */
            return romanNumber.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        }
        return false;
    }

    public static boolean isArabicNumber(String arabicNumber){
        try {
            Integer num = Integer.parseInt(arabicNumber);
            if(num > 0 && num < 5000)
                return true;
        } catch(NumberFormatException e){
            return false;
        }
        return false;
    }
}
