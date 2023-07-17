package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишите программу, которая создает двухмерный
 * массив и заполняет его по следующему принципу: пользователь вводит число (например, 8) первый элемент
 * массива принимает значение этого числа, последующий
 * элемент массива принимает значение этого числа +7 (т.е.
 * 15 для нашего примера), третий элемент массива предыдущий элемент +7 (т.е. 22 для нашего примера). Созданный
 * массив вывести на экран.
 */

public class lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        completionArray(scanner.nextInt());
        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] array = new int[5][5];

    public static void completionArray(int scanner) {
        int counter = scanner;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = counter;
                counter += 7;
            }
        }
    }
}
