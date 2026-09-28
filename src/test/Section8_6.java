package test;

import java.util.Scanner;

public class Section8_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (true) {
            if (number == 0) {
                break;
            }
            System.out.print("숫자: ");
            sum = sum + number;
            number = scanner.nextInt();
        }
        System.out.println("합계: " + sum);
    }
}
