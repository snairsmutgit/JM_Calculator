package org.example;

import org.apache.camel.main.Main;

import java.util.Scanner;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        System.out.println("Введите выражение: ");

        Scanner input = new Scanner(System.in);

        while (true){
            String in = input.next();
            String in2 = input.next();
            String in3 = input.next();

            String Input_Validate = new Input(in, in2, in3).Get_Result();

            if (Input_Validate != null) {
                if (Input_Validate.equals("RIM")) System.out.println(new CalculateRIM((in), in2, (in3)).Get_Result());
                if (Input_Validate.equals("INT"))
                    System.out.println(new CalculateINT(Integer.parseInt(in), in2, Integer.parseInt(in3)).Get_Result());
            } else throw new IllegalArgumentException("ERROR");

        }

    }


}

