package test;

public class Section7_2 {

    public static void main(String[] args) {
        int intNumber = 10;
        double doubleNumber = 15.8;

        int intNumber2;
        double doubleNumber2;

        doubleNumber2 = intNumber;
        System.out.println(doubleNumber2);
        intNumber2 = (int) doubleNumber;
        System.out.println(intNumber2);
    }
}
