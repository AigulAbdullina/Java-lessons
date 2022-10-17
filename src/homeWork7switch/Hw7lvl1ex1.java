package homeWork7switch;

import java.util.Scanner;

public class Hw7lvl1ex1 {
    public static void main(String[] args) {
        System.out.println("Введите номер квартиры от 1 до 90: ");
        Scanner scanner = new Scanner(System.in);
        int numberFlat = scanner.nextInt();
        if(numberFlat <= 20){
            System.out.println("Данная квартира в первом подъезде");
        }
        else if (numberFlat <= 48){
            System.out.println("Данная квартира в втором подъезде");
        }
        else if (numberFlat <= 90){
            System.out.println("Данная квартира в третьем подъезде");
        }
        else
            System.out.println("Ошибка, данной квартиры не существует");
        }

}
