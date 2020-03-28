package org.example;

public class Input {

    private String temp_result3;
    private String result;

    Input(String in1, String in2, String in3){
        if (in2.equals("+")  || in2.equals("-")  || in2.equals("*") || in2.equals("/")  ) {
            temp_result3 = "ok";

            if (Validate_Rim(in1, in3) && temp_result3 == "ok") {
                result = "RIM";
            } else if (Validate_Int(in1, in3) && temp_result3 == "ok") {
                result = "INT";
            }
        }
    }


    private boolean Validate_Int(String in1, String in3){
        boolean in1_is_INT = false;
        boolean in3_is_INT = false;

        for (int i = 1; i < 10 ; i++) {
            if (Integer.parseInt(in1)==i) in1_is_INT = true;;
        }
        for (int i = 1; i < 10 ; i++) {
            if (Integer.parseInt(in3)==i) in3_is_INT = true;;
        }
        if (in1_is_INT && in3_is_INT){
            return  true;
        }else return false;

    }
    private boolean Validate_Rim(String in1, String in3){
        boolean in1_is_RIM = false;
        boolean in3_is_RIM = false;
        for (RimSymbol t : RimSymbol.values()) {
            if (in1.equals(t.toString())) {
                in1_is_RIM = true;
            }
        }
        for (RimSymbol t : RimSymbol.values()) {
            if (in3.equals(t.toString())) {
                in3_is_RIM = true;
            }
        }
        if (in1_is_RIM && in3_is_RIM){
            return  true;
        }else return false;

    }

    public String Get_Result() {
        return result;
    }
}
