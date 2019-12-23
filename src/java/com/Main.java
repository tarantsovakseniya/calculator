package com;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperatorFactory factory = new OperatorFactory();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Double> future;

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

        Callable task = () -> {
            return factory.getCalculation(operator).calculate(a, b);
        };

        future = executor.submit(task);

        try {
            System.out.println("\nThe result is:" + future.get() + ". From thread:" + Thread.currentThread().getName());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}