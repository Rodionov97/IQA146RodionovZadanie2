package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate(98, 1.87);
        System.out.println("BMI: " + bmi);


        System.out.println("BMI: " + service.calculate(96, 1.80));
        System.out.println("BMI: " + service.calculate(130, 2.0));
    }
}