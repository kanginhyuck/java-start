package test.sw_problem;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = 1;

        for (int i = 0; i <= number; i++) {
            System.out.println(result);
            result *= 2;
        }
    }
}