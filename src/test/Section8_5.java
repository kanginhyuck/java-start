package test;

import java.util.Scanner;

public class Section8_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("합계: " + sum);
    }
}