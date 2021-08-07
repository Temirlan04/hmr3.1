package com.company;

public class Main {

    public static void main(String[] args) {
        double[] work = {12.2, 13.6, 16.8, -17.8, 19.0, -23.5, -34.7, -6.7, -9.6, 10.5, -14.2, 12.3, -10.5,  -7.8};

        double sum = 0;
        int counter = 0;
        for (int i = 3; i < work.length; i++) {
            if (work[i]>0){
                sum = sum + work[i];
                counter++;
            }
        }
        System.out.println("Количество положительных чисел ппосле первого отрицательного числа = " + counter);
        System.out.println("Среднее значение положительных чисел = " + sum/counter);

        for (int i = 0; i < work.length; i++) {
            if (work[i] < 0) {
                System.out.println("Первое отрицательное число ="+ work[i]);
                break;
            }
    }




