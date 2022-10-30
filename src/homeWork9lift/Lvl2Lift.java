package homeWork9lift;

public class Lvl2Lift {
    public static void main(String[] args) {
        int high = 20;
        int up = 5;
        int down = 2;
        int count = 0;
        int current = 1;
        while (current < high) {
            count++;
            current += up - down;
        }
        System.out.println(count);
    }
}

