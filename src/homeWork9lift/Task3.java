package homeWork9lift;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //3)Создать программу, выводящую на экран случайно сгенерированное
        // трёхзначное натуральное число и его наибольшую цифру.
        Random random = new Random();
        int number = random.nextInt(899) + 100;
        System.out.println(number);

        int max = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number = number / 10;
        }
        System.out.println(max);
    }
}

