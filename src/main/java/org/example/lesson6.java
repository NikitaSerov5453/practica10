package org.example;

import java.util.Arrays;

/**
 * В двумерноммассиве, заполненном случайными числами, определить минимальный и максимальный элементы
 * для каждой строки. Результаты вывести на экран
 */
public class lesson6 {
    public static void main(String[] args) {
        completionArray();
        System.out.println(Arrays.deepToString(array));
        minValue();
    }

    public static int[][] array = new int[3][3];

    public static void minValue() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
            System.out.println(min);
            System.out.println(max);
            System.out.println();
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
    }

    public static Integer random() {
        return Math.toIntExact(Math.round(Math.random() * 100));
    }

    public static void completionArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random();
            }
        }
    }
}
