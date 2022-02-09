package ru.skypro;

import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.print("Массив сумм: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Task_1");
        float monthAmount = 0;
        for (int dayAmount : arr) {
            monthAmount += dayAmount;
        }
        System.out.println("Сумма трат за месяц составила " + monthAmount + " рублей");

        System.out.println("Task_2");
        float minAmount, maxAmount;
        minAmount = arr[0];
        maxAmount = arr[0];

        for (int currAmount : arr) {
            if (currAmount < minAmount) {
                minAmount = currAmount;
            }
            if (currAmount > maxAmount) {
                maxAmount = currAmount;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей. " +
                           "Максимальная сумма трат за день составила " + maxAmount + " рублей");

        System.out.println("Task_3");
        float averageAmount = monthAmount/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        System.out.println("Task_4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
