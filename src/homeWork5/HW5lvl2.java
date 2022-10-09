package homeWork5;

import java.util.Scanner;

public class HW5lvl2 {
    public static void main(String[] args) {
    int temperatura1 = 235;
    int temperatura2 = 12;
    boolean correctWork = temperatura1 > 100 && temperatura2 < 100;
    System.out.println("Прибор работает корректно: " + correctWork);

        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        Scanner scanner1 = new Scanner(System.in);
        int number2 = scanner.nextInt();
        boolean isDivideForNum1andNum2 = number1 % number2 == 0;
        System.out.println("Делится ли первое число на второе? " + isDivideForNum1andNum2);

        int x = 2;
        int y = 3;
        int sum = x + y;
    }
}
