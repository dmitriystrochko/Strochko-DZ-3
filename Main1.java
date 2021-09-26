package com.company;

import java.util.*;
// Вариант 10.
// Здание 4.10. В последовательности чисел а1,а2,...an, найти два числа среднее арифметическое которых ближе всего к числу у.

        public class Main1 {
            private static final Random RANDOM = new Random();

            private static double getRandomDouble() {
                return (int)(RANDOM.nextDouble() * 1000) / 100.0;
            }

            public static void main(String[] args) {
                double[] numbers = new double[5 + RANDOM.nextInt(4)];
                for (int i = 0; i < numbers.length; ++i) {
                    numbers[i] = getRandomDouble();
                }

                double someNumber = getRandomDouble();

                System.out.println("Число, чтобы найти ближайшее среднее значение: " + someNumber);
                System.out.println("Числа: " + Arrays.toString(numbers));

                double a = numbers[0];
                double b = numbers[1];
                double closestAverage = (a + b) / 2.0;
                double closestAverageDiff = Math.abs(someNumber - closestAverage);
                for (int i = 0; i < numbers.length - 1; ++i) {
                    for (int j = i + 1; j < numbers.length; ++j) {
                        double thisAverage = (numbers[i] + numbers[j]) / 2.0;
                        double thisAverageDiff = Math.abs(someNumber - thisAverage);
                        if (thisAverageDiff < closestAverageDiff) {
                            a = numbers[i];
                            b = numbers[j];
                            closestAverage = thisAverage;
                            closestAverageDiff = thisAverageDiff;
                        }
                    }
                }

                System.out.println("Ближайшее среднее значение " + closestAverage +
                        ", между " + a + " и " + b + ".");
            }
        }




