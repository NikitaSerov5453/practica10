package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * пользователь с клавиатуры вводит зарплату сотрудников фирмы. Необходимо отсортировать полученные
 * данные по возрастанию или убыванию в зависимости
 * от выбора пользователя. Выбор алгоритма сортировки
 * необходимо обосновать вашему преподавателю.
 */
public class lesson2 {
    public static void main(String[] args) {
        dynamicArray(5);
        System.out.println(Arrays.toString(salary));
        Arrays.sort(salary);
        System.out.println(Arrays.toString(salary));
    }

    public static int[] salary = new int[]{};

    public static void dynamicArray(int numberEmployees) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberEmployees; i++) {
            salary = Arrays.copyOf(salary, salary.length + 1);
            salary[i] = scanner.nextInt();
        }
    }
}