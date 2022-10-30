package homeWork9;

public class Task2 {
    public static void main(String[] args) {
        for (int num = 11; num < 100; num++) {
            int reversed = getReversed(num);
            if (num +reversed != num * num) {
                continue;
            }
            System.out.println(num);
        }
    }
    private static int getReversed(int num) {
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

}