package homeWork7;

public class Hw7lvl1ex3 {
    public static void main(String[] args) {
        int month = 2;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Ошибочное значение");
        }
    }
}
