package org.example;

/**
 * В двумерноммассиве, заполненномслучайными числами, определить минимальный и максимальный элементы
 * для каждого столбца. Результаты вывести на экран.
 */
public class lesson7 {
    public static void main(String[] args) {
        minMaxValue();
    }

    public static int[][] array = new int[][]{{1, 2, 3}, {7, 9, 158}, {18, 8986, 0}};

    public static void minMaxValue() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
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
}
