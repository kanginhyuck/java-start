package test;

import java.util.Scanner;

public class Section8_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int number1 = scanner.nextInt();

        System.out.print("두 번째 숫자: ");
        int number2 = scanner.nextInt();

        System.out.println("합: " + (number1 + number2));
        System.out.println("차: " + (number1 - number2));
        System.out.println("곱: " + (number1 * number2));
    }
}
