package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 5);
        int product = calculator.multiply(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // TODO: PART (For Students)
        int difference = calculator.subtract(10, 5);
        int quotient = calculator.divide(10, 5);
        String reversed = calculator.reverse("Gradle");

        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Reversed String: " + reversed);
    }
}
