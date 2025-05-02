package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Init Calculator");
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println("Result: " + result);
    }


}

