package org.example;

public class CalculateINT {

    private int result;

    CalculateINT(int in1, String in3 , int in2){
        switch (in3){
            case "+": result = in1 + in2;break;
            case "-": result = in1 - in2;break;
            case "*": result = in1 * in2;break;
            case "/": result = in1 / in2;break;
        }

    }

    public int Get_Result(){
        return  result;
    }
}
