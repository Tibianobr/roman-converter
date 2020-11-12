package sample.tests;

import sample.service.Converter;

import java.util.ArrayList;
import java.util.List;

public class ConversionTests {

    private static final String[] romanExamples = {
            "MMMDCXXV",
            "MDCCCV",
            "MMMCCXLIII",
            "MMDCCLIX",
            "MMCCCXCIV",
            "MMMCDXCI",
            "MCMLXIX",
            "CCLXXVI",
            "MCLVII",
            "MMMDLII",
            "CCXLIII",
    };

    private static final Integer[] romanExamplesResults = {
            3625,
            1805,
            3243,
            2759,
            2394,
            3491,
            1969,
            276,
            1157,
            3552,
            243
    };

    public boolean runTests()
    {
        for (int i = 0; i < romanExamples.length; i++) {
            if (Converter.toArabic(romanExamples[i]).intValue() != romanExamplesResults[i])
                return false;
            if (!Converter.toRoman(romanExamplesResults[i]).equals(romanExamples[i]))
                return false;
        }
        return true;
    }
}