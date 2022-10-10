package homeWork6;

import java.util.Random;
import java.util.Scanner;

public class Hw6lvl1 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст: ");
        Scanner scanner = new Scanner(System.in);
        int ageOfPerson = scanner.nextInt();
        if (ageOfPerson > 18) {
            System.out.println("Вам можно идти смотреть кино");
        } else {
            System.out.println("Вам нельзя идти в кино");
        }


        System.out.println("Введите год: ");
        Scanner scanner1 = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year % 4 == 0){
            System.out.println("Год високосный");
        }
        else{
            System.out.println("Год не високосный");
        }

        System.out.println("Сколько печенья покупатель хочет купить? ");
        Scanner scanner2 = new Scanner(System.in);
        int numberOfCookies = scanner.nextInt();

        System.out.println("Сколько денег у покупателя? ");
        Scanner scanner3 = new Scanner(System.in);
        int moneyOfBuyer = scanner.nextInt();
        if (moneyOfBuyer/0.5 > numberOfCookies){
            System.out.println("Можно купить");
        }
        else{
            System.out.println("Нельзя купить");
        }

        Random random = new Random();
        boolean coin = random.nextBoolean();
        System.out.println(random.nextBoolean());

        if (!coin) {
            System.out.println("Решка");
        } else {
            System.out.println("Орел");
        }
    }
}
