package com.crido;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BasicCalculator calc = new BasicCalculator();
        calc.add(2, 3);
        System.out.println(calc.getResult());

        calc.subtract(4, 5);
        System.out.println(calc.getResult());

        calc.multiply(6, 7);
        System.out.println(calc.getResult());

        calc.divide(8, 9);
        System.out.println(calc.getResult());
    }
}