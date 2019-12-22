package com.factory.operators;

import com.Calculation;

public class OperatorGreater extends Calculation {
    @Override
    public double calculate(double a, double b) {
        if(a>b) return 0;
        return 1;
    }
}
