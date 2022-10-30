package homeWork10;

import java.util.Scanner;

public class Task3Triangle {
    public static void main(String[] args) {
        System.out.println("Высота треугольника равна:  ");
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < high - i; j++) {
                System.out.print(" ");}

            for (int j = 0; j < i * 2 -1 ; j++) {
                System.out.print("ˆ");}

            System.out.println(" ");
            }
    }
}

