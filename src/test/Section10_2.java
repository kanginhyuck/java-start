package test;

public class Section10_2 {

    public static void main(String[] args) {

        System.out.println(isEven(10));
        System.out.println(isEven(7));

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else  {
            return false;
        }
    }
}
