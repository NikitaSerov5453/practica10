package org.example;

public class lesson8 {
    public static void main(String[] args) {
        System.out.println("Сумма матриц: " + (sumArray(array) + sumArray(array2)));
        System.out.println("Разница матриц: " + ((sumArray(array)) - sumArray(array2)));
        System.out.println("Произведение матриц: " + ((sumArray(array)) * sumArray(array2)));
    }
    public static int[][] array = new int[][]{{1, 2}, {7, 9}};
    public static int[][] array2 = new int[][]{{6, 45}, {2, 456}};

    public static int sumArray(int[][] array) {
        int counter = 0;
        for (int[] ints : array) {
            for (int j = 0; j < 2; j++) {
                counter += ints[j];
            }
        }
        return counter;
    }

}
