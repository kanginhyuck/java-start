package test;

import java.util.Scanner;

public class Section8_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자: ");
            int number1 = scanner.nextInt();

            System.out.print("두 번째 숫자: ");
            int number2 = scanner.nextInt();
            scanner.nextLine(); //이 부분은 전혀 생각지도 못했어서 지피티 찬스 썻음
                                //그 전까지는 다맞았음

            System.out.print("연산자: ");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                break;
            } else if (operation.equals("+")) {
                System.out.println(number1 + number2);
            } else if (operation.equals("-")) {
                System.out.println(number1 - number2);
            } else if (operation.equals("*")) {
                System.out.println(number1 * number2);
            } else if (operation.equals("/")) {
                System.out.println(number1 / number2);
            }
        }
    }
}
