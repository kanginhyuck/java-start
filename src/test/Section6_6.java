package test;

public class Section6_6 {

    public static void main(String[] args) {
        int n = 20;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
            sum = sum + i;
            }
        } //코드를 쓴 순서는 맞았는데 이것저것 수정하면서 중괄호들이 엉켜서 계속 실행이 안되길래 지피티한테 물어봄
            System.out.println(sum);
    }
}

