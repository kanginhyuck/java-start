package test;

public class Section5_6 {

    public static void main(String[] args) {
        int age = 17;

        if (age <= 7) {
            System.out.println("5000원");
        } else if (age <= 13) {
            System.out.println("7000원");
        } else if (age <= 19) {
            System.out.println("9000원");
        } else if (age <= 64) {
            System.out.println("12000원");
        } else {
            System.out.println("6000원");
        }
    }
}