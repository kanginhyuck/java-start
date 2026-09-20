package SWEA;

import java.util.Scanner;

public class AcademyEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            num = num * 2;
            System.out.print(num + " ");
        }
    }
}