package sample.tests;

import sample.service.Converter;
import sample.service.Validator;

public class ValidationTests {

    private static final String[] romanValidExamples = {
            "MMMDCXXV",
            "MDCCCV",
            "MMMCCXLIII",
            "MCLVII",
            "MMMDLII",
            "CCXLIII",
    };

    private static final String[] romanInvalidExamples = {
            "MMMM",
            "XOEIV",
            "HKEOQ",
            "12312",
            "IIIIXXXXX"
    };

    private static final String[] arabicValidExamples = {
            "1",
            "3625",
            "276",
            "1157",
            "3552",
            "243",
            "4999"
    };

    private static final String[] arabicInvalidExamples = {
            "0",
            "-1",
            "5000",
            "100000",
            "328993203",
            "-99999",
            "abcde",
            "hufdai"
    };



    public boolean runTests()
    {
        for (int i = 0; i < romanValidExamples.length; i++) {
            if (!Validator.isRomanNumber(romanValidExamples[i]))
                return false;
        }
        for (int i = 0; i < romanInvalidExamples.length; i++) {
            if (Validator.isRomanNumber(romanInvalidExamples[i]))
                return false;
        }
        for (int i = 0; i < arabicValidExamples.length; i++) {
            if (!Validator.isArabicNumber(arabicValidExamples[i]))
                return false;
        }
        for (int i = 0; i < arabicInvalidExamples.length; i++) {
            if (Validator.isArabicNumber(arabicInvalidExamples[i]))
                return false;
        }

        return true;
    }
}