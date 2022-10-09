package homeWork4;

import java.util.Scanner;

    public class number5 {
        public static void main(String[] args) {
            Scanner temperatura = new Scanner (System.in);
            double far, cel;
            System.out.print("Введите температуру в Цельсий: ");
            cel = temperatura.nextDouble();
            far =(cel * 1.8 +32);
            System.out.println("Фаренгейт:" + far);

            System.out.print("Введите температуру в Фаренгейт: ");
            far = temperatura.nextDouble();
            cel =((far - 32)/1.8);
            System.out.println("Цельсий:" + cel);
        }
    }
