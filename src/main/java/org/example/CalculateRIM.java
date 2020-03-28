package org.example;

import java.util.List;

public class CalculateRIM {

    String result;

    CalculateRIM(String in1, String in3 , String in2){
        int input1 = Convert(in1);
        String input2 = in3;
        int input3 = Convert(in2);
        int temp = new CalculateINT(input1,input2,input3).Get_Result();

        result =  Int_to_RIM(temp);

    }

    private int Convert(String in){

        for (RimSymbol t : RimSymbol.values()) {
            if (in.equals(t.toString())) {
                return t.Get_num();
            }
        }
        return 0;
    }


    public String Get_Result(){
        return  result;
    }


    public static String Int_to_RIM(int number) {

        List<RimSymbolForConvert> rim_symbol = RimSymbolForConvert.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();
        if (number<0){
            number =  Math.abs(number);
            sb.append('-');
           }
        while ((number > 0) && (i < rim_symbol.size())) {
            RimSymbolForConvert currentSymbol = rim_symbol.get(i);
            if (currentSymbol.Get_Value() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.Get_Value();
            } else {
                i++;
            }
        }

        return sb.toString();
    }



}
