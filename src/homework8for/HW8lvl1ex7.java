package homework8for;

import java.util.Scanner;

public class HW8lvl1ex7 {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число ");
        Scanner scanner1 = new Scanner(System.in);
        int secondNumber = scanner.nextInt();
        System.out.println("Результат умножения первого числа на второе? ");
        Scanner scanner2 = new Scanner(System.in);
        int result = scanner.nextInt();

        if (result == firstNumber * secondNumber) {
            System.out.println("Верный ответ!");
        }
        else {
            System.out.println("Не правильно! " + "Верный ответ - " + (firstNumber * secondNumber));
        }
    }
}
