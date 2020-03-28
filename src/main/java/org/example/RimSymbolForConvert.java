package org.example;

import java.util.Arrays;
import java.util.List;

public enum RimSymbolForConvert {
    M(1000),CM(900),D(500),CD(400),C(100), XC(90), L(50),XL(40), X(10), IX(9), V(5), IV(4),I(1);

    private int value;

    RimSymbolForConvert(int value) {
        this.value = value;
    }

    public int Get_Value() {
        return value;
    }

    public static List<RimSymbolForConvert> getReverseSortedValues() {
        return   Arrays.asList(RimSymbolForConvert.values());
    }


}
