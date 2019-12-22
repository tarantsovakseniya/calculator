package com.factory.operators;

import com.Calculation;

public class OperatorEquality extends Calculation {
    @Override
    public double calculate(double a, double b) {
        if (a == b) return 0;
        return 1;
    }
}
