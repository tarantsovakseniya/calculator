package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperatorFactory factory = new OperatorFactory();

        System.out.print("Please, enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Please, enter second number: ");
        double b = scanner.nextDouble();

        System.out.print(
                "What would you like to get?:\n" +
                "1.sum;\n" +
                "2.minus;\n" +
                "3.division;\n" +
                "4.multiply;\n" +
                "5.equality;\n" +
                "6.greater;\n" +
                "7.less;\n" +
                "8.remainder.\n");
        int operator = scanner.nextInt();

        System.out.println("\nThe result is:" + factory.getCalculation(operator).calculate(a, b));
    }
}
