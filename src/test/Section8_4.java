package test;

import java.util.Scanner;

public class Section8_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단을 입력하세요: ");
        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
