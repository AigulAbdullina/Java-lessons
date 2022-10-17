package homework8for;

import java.util.Scanner;

public class HW8lvl1ex1e2e3 {
    public static void main(String[] args) {
        System.out.println("Введите первое значение года ");
        Scanner scanner = new Scanner(System.in);
        int firstYear = scanner.nextInt();
        System.out.println("Введите второе значение года ");
        Scanner scanner1 = new Scanner(System.in);
        int secondYear = scanner.nextInt();
        int result = 0;
        for (int i = firstYear; i <= secondYear; i++) {
            if (i % 4 == 0) {
                result = result + 1;
            }
        }
        System.out.println(result);

//2) напишите программу, которая проверяет является ли число простым

        System.out.println("Введите число: ");
        Scanner scanner2 = new Scanner(System.in);
        int number = scanner.nextInt();
        int divideOfnumber = 0;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                divideOfnumber = divideOfnumber + 1;
            }
        }
        if (divideOfnumber == 0) {
            System.out.println("Число " + number + " простое");
        }
        else
            System.out.println("Число " + number + " не простое");

//3) Вывести на консоль те из двузначные числа которые делятся на 4, но не делятся на 6.

        for (int j = 10; j < 100; j++) {
            if (j % 4 == 0 && j % 6 != 0) {
                System.out.println(j);
            }
        }
    }
}
