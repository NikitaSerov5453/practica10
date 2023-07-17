package org.example;


import java.util.Arrays;
import java.util.Collections;

/**
 * Есть одномерныймассив из 15 элементов, заполненный
 * случайными числами. Необходимо первые 7 элементов
 * отсортировать по возрастанию, оставшиеся 8 элементов
 * по убыванию. Выбор алгоритма сортировки необходимо
 * обосновать вашему преподавателю
 */
public class lesson3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arraySort()));
        reversSort();
        array3();
        System.out.println(Arrays.toString(array));
    }

    public static Integer[] array = new Integer[]{489, 1568, 15, 789, 3, 9, 74, 78, 1, 1, 1, 781, 89, 7, 15};
    public static Integer[] array2 = new Integer[]{};

    public static Integer[] arraySort() {
        Arrays.sort(array, 0, 7);

        return array;
    }

    public static void reversSort() {
        array2 = Arrays.copyOfRange(array, 8, array.length);
        Arrays.sort(array2, Collections.reverseOrder());
    }

    public static void array3() {
        int counter = 0;
        for (int i = 8; i < array.length; i++) {
            array[i] = array2[counter];
            counter++;
        }
    }

}
