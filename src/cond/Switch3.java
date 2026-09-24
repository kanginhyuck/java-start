package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
            case 3:
                coupon = 3000;

            default:
                coupon = 500;
        }
        System.out.println("발급받을 쿠폰 " + coupon);
    }
}
