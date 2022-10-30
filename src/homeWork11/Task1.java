package homeWork11;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //Найти номер и значение первого положительного элемента массива.
        int[] array = new int[20];
        Random random  = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(100) -15;
    }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i <array.length ; i++) {
        if (array[i] > 0) {
            System.out.println("index: " + i + " val: " + array[i]);
            break;
        }
        }
}
}
