package com.factory.operators;

import com.Calculation;

public class OperatorMultiply extends Calculation {
    @Override
    public double calculate(double a, double b) {
        return (a*b);
    }
}
