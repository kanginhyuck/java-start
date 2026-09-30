package test;

public class Section9_5 {

    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 70},
                {60, 75, 85},
                {100, 95, 90}
        };

        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total = total + scores[i][j];
            }
            System.out.println((i + 1) + "번 학생 총점: " + total);
        }
    }
}
