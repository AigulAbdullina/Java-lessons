package homework8for;

public class HW8lvl1ex4e5e6 {
    public static void main(String[] args) {

//4) Вывести на консоль сумму чисел от 0 до 100 и вывести на консоль

        int sum = 0;
        for (int i = 0; i < 100; i++){
            sum = sum + i;
        }
        System.out.println ("Сумма чисел от 0 до 100 равнв " + sum);

//5) Вывести на консоль числа от -10 до -40.
        for (int i = -10; i >= -40 ; i--) {
            System.out.println(i);
            }

 //6)Вывести на консоль произведение двузначных нечетных чисел кратных 13
        int total = 1;
        for (int i = 10; i < 100 ; i++) {
            if (i % 2 != 0 && i % 13 == 0 ){
                total = total * i;}
        }
        System.out.println("Произведение двузначных нечетных чисел кратных 13 = " + total);
        }
    }

