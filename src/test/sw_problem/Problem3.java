package test.sw_problem;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        if (numberA == 1 && numberB == 3) {
            System.out.println("A");
        } else if (numberA == 2 && numberB == 1) {
            System.out.println("A");
        } else if (numberA == 3 && numberB == 2) {
            System.out.println("A");
        } else if (numberA == 1 && numberB == 1) {
            System.out.println();
        } else if (numberA == 2 && numberB == 2) {
            System.out.println();
        } else if (numberA == 3 && numberB == 3) {
            System.out.println();
        } else {
            System.out.println("B");
        }
    }
}