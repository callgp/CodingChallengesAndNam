package com.nam;

public class Car {
    private int weight;

    static class Wheel {
        private static int spokes;
        private String name;

        public void test(Car car) {
            car.weight = 5000;
            System.out.println("car's weight is: " + car.weight);
        }
    }
}