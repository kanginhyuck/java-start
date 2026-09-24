package test;

public class Section5_8 {

    public static void main(String[] args) {
        int menu = 3;
        int money = 5000;

        if (menu == 1) {
            if (money >= 1500) { //if문 안에 또다른 if문을 넣을 수 있는게 생각이 안났음
                System.out.println("콜라");
                System.out.println("거스름돈: " + (money - 1500) + "원");
            } else {
                System.out.println("금액이 부족합니다");
            }
        } else if (menu == 2) {
            if (money >= 1300) {
                System.out.println("사이다");
                System.out.println("거스름돈: " + (money - 1300) + "원");
            } else {
                System.out.println("금액이 부족합니다");
            }
        } else if (menu == 3) {
            if (money >= 2000) {
                System.out.println("커피");
                System.out.println("거스름돈: " + (money - 2000) + "원");
            } else {
                System.out.println("금액이 부족합니다");
            }
        } else {
            System.out.println("잘못된 메뉴입니다");
        }
    }
}  //중괄호가 시작했을때 어디서 끝나는지가 아직 헷갈림
   //