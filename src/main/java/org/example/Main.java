package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Init Calculator");
        Calculator calculator = new Calculator();
        int add_result = calculator.add(1, 2);
        System.out.println("Result: " + add_result);

        int sub_result = calculator.sub(1, 2);
        System.out.println("Result: " + sub_result);
    }


}

