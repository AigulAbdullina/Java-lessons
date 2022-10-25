package homeWork10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int totalCount = 0;
        int number;
        do {
            System.out.println("Введите целое число:  ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            totalCount++;
            }
            while (number > 2) ;

        System.out.println("Итого было введено чисел: " + totalCount);
        }
      
    }

