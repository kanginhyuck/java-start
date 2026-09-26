package test.mini_test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("상품: ");
        String name = scanner.nextLine();

        System.out.print("가격: ");
        int price = scanner.nextInt();

        System.out.print("개수: ");
        int quantity = scanner.nextInt();

        int totalPrice = price * quantity;

        System.out.println("상품: " + name);
        System.out.println("구매 개수: " + quantity);
        System.out.println("총 금액: " + totalPrice + "원");
    }
}
