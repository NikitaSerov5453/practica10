package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Есть одномерный массив из 10 элементов, заполненный случайными числами. Необходимо найти число,
 * введенное пользователем. Используйте алгоритм бинарного поиска.
 */
public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binarySearch(scanner.nextInt());
    }

    public static int[] array = new int[]{489, 1568, 15, 789, 3, 9, 74, 78, 1, 12,};

    public static void binarySearch(int scanner) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, scanner);
        if (index > 0) {
            System.out.println("Число найдено");
        } else {
            System.out.println("Число не найдено");
        }
    }

}
