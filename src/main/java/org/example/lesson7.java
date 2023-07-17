package org.example;

import java.util.Arrays;

/**
 * В двумерноммассиве, заполненномслучайными числами, определить минимальный и максимальный элементы
 * для каждого столбца. Результаты вывести на экран.
 */
public class lesson7 {
    public static void main(String[] args) {
        completionArray();
        System.out.println(Arrays.deepToString(array));
        minMaxValue();
    }

    public static int[][] array = new int[3][3];

    public static void minMaxValue() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[j][i] < min) {
                    min = array[j][i];
                }
                if (array[j][i] > max) {
                    max = array[j][i];
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
