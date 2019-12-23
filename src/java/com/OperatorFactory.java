package com;

import com.factory.operators.*;

public class OperatorFactory{

    public Calculation getCalculation (int operator){
        Calculation toReturn = null;

        switch (operator){
            case 1:
                toReturn=new OperatorSum();
                break;
            case 2:
                toReturn=new OperatorMinus();
                break;
            case 3:
                toReturn=new OperatorDivide();
                break;
            case 4:
                toReturn=new OperatorMultiply();
                break;
            case 5:
                toReturn=new OperatorEquality();
                break;
            case 6:
                toReturn=new OperatorGreater();
                break;
            case 7:
                toReturn=new OperatorLess();
                break;
            case 8:
                toReturn=new OperatorRemainder();
                break;
        }
        return toReturn;
    }
}