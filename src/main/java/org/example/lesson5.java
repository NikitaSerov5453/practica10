package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        addArray();
        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] array = new int[3][3];

    public static void addArray() {
        int sum = 0;
        int counter = 0;
        double sa;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
                sum += array[i][j];
                counter++;
            }
        }
        sa = (double) sum/counter;
        System.out.println(sum);
        System.out.println(sa);
    }
}
