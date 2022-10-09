package homeWork5;

import java.util.Scanner;

public class HW5lvl1 {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWindy = false;
        boolean canSwim = isSunny && !isWindy;
        System.out.println("Можем ли мы поплавать? "+ canSwim);

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        boolean canBuy = isReweOpen || isEdekaOpen;
        System.out.println("Возможно ли сходить в магазтн за покупками? " + canBuy);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isDivideFor4And6(num));

        String string = scanner.next();
        boolean isMoreThan7 = string.length() > 7;
        System.out.println("Длинна строки больше 7? " + isMoreThan7);

    }
    static boolean isDivideFor4And6(int num) {
        boolean isDivFor4 = num % 4 == 0;
        boolean isDivFor6 = num % 6 == 0;
        return isDivFor4 && isDivFor6;
    }

}
