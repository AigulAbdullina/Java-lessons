package homeWork9;

public class Task1 {
    public static void main(String[] args) {


int num = 1000;
        while (num < 10_000){
            int forthDigit = num % 10;
            num /= 10;
            int thirdDigit = num % 10;
            num /= 10;
            if(forthDigit == thirdDigit ){
                continue;
            }

            int secondDigit = num % 10;
            num /= 10;
            if(secondDigit == thirdDigit || secondDigit == forthDigit){
                continue;
            }
            int firstDigit = num % 10;
            if(firstDigit == secondDigit || firstDigit == thirdDigit || firstDigit == forthDigit ){
                continue;
            }

        }
        System.out.println(num);
    }
}
