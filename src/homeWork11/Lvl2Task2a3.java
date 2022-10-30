package homeWork11;

import java.util.Arrays;
import java.util.Random;

public class Lvl2Task2a3 {
    public static void main(String[] args) {
        //Дан массив(сгенерируйт значения). Найти среднее арифметическое его элементов.
        // Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
        int[] array = new int[10];
        Random random = new Random();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];}

        double middle = 0.0;
        middle = sum / array.length;
        System.out.println("Среднее арифметическое значение массива равно: " + middle);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > middle) {
                System.out.println(array[i]);
            }
        }

        //Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.

        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                System.out.println(array[i]);
            }
        }

    }
    }
