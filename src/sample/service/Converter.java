package sample.service;

import java.util.TreeMap;

public class Converter {

    private final static TreeMap<Integer, String> arabicToRomanMap = new TreeMap<>();
    static {
        arabicToRomanMap.put(1000, "M");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(1, "I");
    }

    public static String toRoman(Integer arabicNumber)
    {
        int l =  arabicToRomanMap.floorKey(arabicNumber);
        if ( arabicNumber == l ) {
            return arabicToRomanMap.get(arabicNumber);
        }
        return arabicToRomanMap.get(l) + toRoman(arabicNumber-l);
    }



    public static Integer toArabic(String romanNumber)
    {
        if (romanNumber.startsWith("M")) return 1000 + toArabic(romanNumber.substring(1));
        if (romanNumber.startsWith("CM")) return 900 + toArabic(romanNumber.substring(2));
        if (romanNumber.startsWith("D")) return 500 + toArabic(romanNumber.substring(1));
        if (romanNumber.startsWith("CD")) return 400 + toArabic(romanNumber.substring(2));
        if (romanNumber.startsWith("C")) return 100 + toArabic(romanNumber.substring(1));
        if (romanNumber.startsWith("XC")) return 90 + toArabic(romanNumber.substring(2));
        if (romanNumber.startsWith("L")) return 50 + toArabic(romanNumber.substring(1));
        if (romanNumber.startsWith("XL")) return 40 + toArabic(romanNumber.substring(2));
        if (romanNumber.startsWith("X")) return 10 + toArabic(romanNumber.substring(1));
        if (romanNumber.startsWith("IX")) return 9 + toArabic(romanNumber.substring(2));
        if (romanNumber.startsWith("V")) return 5 + toArabic(romanNumber.substring(1));
        if (romanNumber.startsWith("IV")) return 4 + toArabic(romanNumber.substring(2));
        if (romanNumber.startsWith("I")) return 1 + toArabic(romanNumber.substring(1));
        if (romanNumber.isEmpty()) return 0;
        return null;
    }
}
