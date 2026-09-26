package test.mini_test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("양수");
        } else if (number < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }


        if (number % 2 == 0 && number != 0) {
            System.out.println("짝수");
        } else if (number % 2 == 1) {
            System.out.println("홀수");
        }


        if (number % 3 == 0 && number != 0) {
            System.out.println("3의 배수");
        } else if (number % 3 != 0) {
            System.out.println("3의 배수가 아님");
        }
    }
}