package SWEA;

import java.util.Scanner;

public class AcademyEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        int num = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.print(num - i + " ");
        }
    }
}
