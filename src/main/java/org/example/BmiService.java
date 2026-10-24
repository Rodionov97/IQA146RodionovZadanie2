package org.example;

public class BmiService {
    public int calculate(double weightInKg, double heightInMeters) {
        double index = weightInKg / (heightInMeters * heightInMeters);
        return (int) index;
    }
}
