package com.company;

public class Main {

    public static void main(String[] args) {
        // Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
        double a = 5; //первый член арифметической последовательности
        double d = 4; //шаг, разность прогрессии
        int n = 9; //число членов арифметической прогрессии
        System.out.println("Арифметическая прогрессия:  ");
        for (int i = 0; i <= (n - 1); i++) {
            System.out.print(a + i * d + "   ");
        }
        System.out.println("\n");

        double b = 1; //первый член геометрической прогрессии
        double c = b;
        double q = 2; //знаменатель геометрической прогрессии
        int m = 9; //число членов геометрической прогрессии
        System.out.println("Геометрическая прогрессия:  ");
        for (int i = 0; i <= (m - 1); i++) {
            System.out.print((c *= q) + "   ");
        }
        System.out.println("\n");
    }
}
