package org.example;

import java.util.Arrays;
import java.util.Scanner;

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
