package com.factory.operators;

import com.Calculation;

public class OperatorLess extends Calculation {
    @Override
    public double calculate(double a, double b) {
        if (a < b) return 0;
        return 1;
    }
}