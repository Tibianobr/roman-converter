package sample.service;

import sample.model.ResultNumber;

public class Manager {

    public ResultNumber executeConversion(String type, String number)
    {
        ResultNumber result = null;
        if (type.equals("arabicToRoman"))
        {
            if (Validator.isArabicNumber(number))
            {
                result = new ResultNumber("Conversão OK");
                result.setNumber(Converter.toRoman(Integer.parseInt(number)));
            }
            else
                result = new ResultNumber("Número inválido ou não suportado");
        }
        else if(type.equals("romanToArabic"))
        {
            if (Validator.isRomanNumber(number))
            {
                result = new ResultNumber("Conversão OK");
                result.setNumber(Converter.toArabic(number).toString());
            }
            else
                result = new ResultNumber("Número inválido ou não suportado");
        }
        return result;
    }
}
