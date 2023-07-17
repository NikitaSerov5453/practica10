package org.example;

/**
 * В двумерноммассиве, заполненномслучайными числами, определить минимальный и максимальный элементы
 * для каждой строки. Результаты вывести на экран
 */
public class lesson6 {
    public static void main(String[] args) {
        minValue();
    }

    public static int[][] array = new int[][]{{1, 2, 3}, {7, 9, 158}, {18, 8986, 0}};

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
}
