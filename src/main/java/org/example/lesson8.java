package org.example;

import java.util.Arrays;

/**
 * Есть два двумерных массива (матрицы размером
 * 2x2), заполненные случайными числами. Найдите сумму
 * матриц, разницу матриц, произведение матриц
 */

public class lesson8 {
    public static void main(String[] args) {
        completionArray(array);
        completionArray(array2);
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(array2));
        System.out.println();
        sumArray(array, array2);
        subtractionArray(array, array2);
        multiplicationArrays(array, array2);

    }
    public static int[][] array = new int[2][2];
    public static int[][] array2 = new int[2][2];



    public static void sumArray(int[][] array, int[][] array2) {
        int[][] sumArrays = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                sumArrays[i][j] = array[i][j] + array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sumArrays));
    }

    public static void subtractionArray(int[][] array, int[][] array2) {
        int[][] subtractionArrays = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                subtractionArrays[i][j] = array[i][j] - array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(subtractionArrays));
    }
    public static void multiplicationArrays(int[][] array, int[][] array2) {
        int[][] multiplicationArrays = new int[2][2];
        multiplicationArrays[0][0] = array[0][0] * array2[0][0] + array[0][1] * array2[1][0];
        multiplicationArrays[0][1] = array[0][0] * array2[0][1] + array[0][1] * array2[1][1];
        multiplicationArrays[1][0] = array[1][0] * array2[0][0] + array[1][1] * array2[1][0];
        multiplicationArrays[1][1] = array[1][0] * array2[0][1] + array[1][1] * array2[1][1];

        System.out.println(Arrays.deepToString(multiplicationArrays));
    }

    public static Integer random() {
        return Math.toIntExact(Math.round(Math.random() * 10));
    }

    public static void completionArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = random();
            }
        }
    }

}
