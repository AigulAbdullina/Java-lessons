package homeWork11;

import java.util.Arrays;
import java.util.Random;

public class Lvl2Task1 {
    public static void main(String[] args) {
        //Все элементы массива поделить на значение наибольшего элемента этого массива.
        //Задача состоит из двух подзадач:
        //Поиск максимума.
        //Деление на него элементов массива.
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];}
        }
        System.out.println(max);

            for (int i = 0; i < array.length; i++) {
                array[i] /= max;}

            System.out.println(Arrays.toString(array));
        }
    }