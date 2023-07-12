package org.example;

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
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            indexJ++;

            System.out.println(min);
            System.out.println(max);
            System.out.println();

        }

    }
}
