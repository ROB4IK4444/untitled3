package com.company;

import java.io.OptionalDataException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
    generateRandomArray();
    }

    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;}
        for (int k : arr) {
            sum += k;
        }

        int max = - 1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        int min = 200_000;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i -- ){
            System.out.println("i =" + reverseFullName[i]);}
        double sum1 = sum;
        double longs = arr.length;
        double averageSpending = sum1 / longs;
            String a = Arrays.toString(arr);
            System.out.println(a);
            System.out.println(Arrays.toString(arr));
            System.out.println("Сумма трат за месяц составила " + sum + " рублей!");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей!");
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей!");
            System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей!");
        return arr;


        }

    }

