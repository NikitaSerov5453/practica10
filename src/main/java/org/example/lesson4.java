package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Есть одномерный массив из 10 элементов, заполненный случайными числами. Необходимо найти число,
 * введенное пользователем. Используйте алгоритм бинарного поиска.
 */
public class lesson4 {
    public static void main(String[] args) {
        completionArray();
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        binarySearch(scanner.nextInt());
    }

    public static int[] array = new int[10];

    public static void binarySearch(int scanner) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, scanner);
        if (index > 0) {
            System.out.println("Число найдено");
        } else {
            System.out.println("Число не найдено");
        }
    }

    public static Integer random() {
        return Math.toIntExact(Math.round(Math.random() * 100));
    }

    public static void completionArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random();
        }
    }

}
