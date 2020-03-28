package org.example;

public enum RimSymbol {
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10);


    private  int  val;

    RimSymbol(int i) {
        this.val=i;
    }

    public int Get_num(){
        return val;
    }
}
