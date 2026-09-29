package test.mini_test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("국어: ");
        int korean = scanner.nextInt();
        System.out.print("영어: ");
        int english = scanner.nextInt();
        System.out.print("수학: ");
        int math = scanner.nextInt();

        int totalScore = korean + english + math;
        double average = (double) totalScore / 3;

        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + average);
    }
}
