package test;

import java.util.Scanner;

public class Section8_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("양수");
        } else if (number < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
