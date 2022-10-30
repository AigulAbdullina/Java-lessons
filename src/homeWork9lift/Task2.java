package homeWork9lift;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2) Необходимо суммировать все нечётные целые числа в диапазоне,
        // который введёт пользователь с клавиатуры
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();

        System.out.println("Введите второе число: ");
        Scanner scanner1 = new Scanner(System.in);
        int secondNum = scanner.nextInt();

        int sum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            if(i % 2 !=0){
                sum += i;
            }
        }
        System.out.println(sum);

    }

}
