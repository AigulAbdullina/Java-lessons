package homeWork11;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // Создайте массив А[1..100] с помощью генератора случайных чисел и выведите его на экран.
        // Увеличьте все его элементы в 2 раза.
        int[] array = new int[100];
        Random random  = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));
        
        
    }
}
