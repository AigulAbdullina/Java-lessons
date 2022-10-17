package homeWork6if;

import java.util.Random;

public class Hw6lvl1ex5 {
    public static void main(String[] args) {
        Random random1 = new Random();
        int numberOfCar = random1.nextInt(10000);
        System.out.println(random1.nextInt(10000));

        Random random2 = new Random();
        boolean isLorry = random2.nextBoolean();
        System.out.println(random2.nextBoolean());

        if((numberOfCar / 2 == 0) && (!isLorry)){
            System.out.println("Можно заезжать в город");
        }
        else { System.out.println("Нельзя заезжать");

        }
}
    }
