package HomeWork3;

import java.util.Scanner;

public class HW3SecondLvl {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Ваше имя начинается с буквы " + name.charAt(0));


        double param = 59.976;
        int paramRound = (int) Math.round(param);
        System.out.println(paramRound);


        int val1 = 475;
        short val2 = (short)val1;
        System.out.println(val2);


    }
}