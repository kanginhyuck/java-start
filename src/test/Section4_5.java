package test;

public class Section4_5 {

    public static void main(String[] args) {
        int a = 18;
        int b = 25;

        boolean result1 = (10 <= a) && (a <= 30) && (a % 3 == 0);
        boolean result2 = (10 <= b) && (b <= 30) && (a % 3 != 0);
        System.out.println(result1);
        System.out.println(result2);
    }
}
