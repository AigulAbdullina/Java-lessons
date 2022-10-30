package homeWork11;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //С 8 до 20 часов температура воздуха измерялась ежечасно.
        // Известно, что в течение этого времени температура понижалась.
        // Определите, в котором часу была впервые отмечена отрицательная температура.
        int[] temp = new int[24];
        Random random = new Random();
        for (int i = 8; i <= 20; i++) {
            temp[i] = random.nextInt(9) - 5;}
        System.out.println(Arrays.toString(temp));

        int tempFirstNeg = 0;
        for (int i = 8; i <= 20; i++) {
            if (temp[i] < 0) {
                tempFirstNeg = i;
                break;}
        }
        System.out.println(tempFirstNeg);
    }
}
