package homeWork9lift;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4) Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
        // (заранее не известно сколько цифр будет в числе).
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println(sum);

    }
}
