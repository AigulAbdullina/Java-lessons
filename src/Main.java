public class Main {
    public static void main(String[] args)
    {
        String IStudyBasicJavaStr = "I study Basic Java!";
        System.out.println(IStudyBasicJavaStr.charAt(18));
        System.out.println(IStudyBasicJavaStr.contains("Java"));
        System.out.println(IStudyBasicJavaStr.replace("a","o" ));
        System.out.println(IStudyBasicJavaStr.toUpperCase());
        System.out.println(IStudyBasicJavaStr.toLowerCase());
        System.out.println(IStudyBasicJavaStr.substring(0,13));


        double percent = (200.0 / 470) * 100;
        System.out.println(percent);

        char g = 'g';
        int in = Character.getNumericValue(g);
        System.out.println(in);

    }
}