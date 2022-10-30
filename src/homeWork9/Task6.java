package homeWork9;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:  ");
        Scanner scanner1 = new Scanner(System.in);
        int secondNumber = scanner.nextInt();
        for (int i = firstNumber; i < secondNumber; i++) {

            for(int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    System.out.println("делители числа " + i + "это " + j );

                }
            }
        }
    }
}
