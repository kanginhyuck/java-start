package test;

public class Section6_8 {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("===" + i + "단===");
            for (int j = 1; j <= 9; j++) {
                if (i * j > 30) {
                    break;
                }
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
/*public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            System.out.println("===" + i + "단===");
            System.out.println(i + " x " + j + " = " + (i * j));
            if (i * j > 30) {
                break;

 */         //밑에 주석으로 적은 부분이 내가 풀어본거