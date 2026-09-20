package SWEA;

import java.util.Scanner;

public class AcademyEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A == 1 && B == 3) {
            System.out.println("A");
        } else if (A == 2 && B == 1) {
            System.out.println("A");
        } else if (A == 3 && B == 2) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
