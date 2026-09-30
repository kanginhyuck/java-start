package test;

public class Section9_6 {

    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 70},
                {60, 75, 85},
                {100, 95, 90},
                {70, 65, 80}
        };
        double average = 0;
        int count = 0;
        for (int i =0; i < scores.length; i++){
            int total = 0;
            for (int j =0; j < scores[i].length; j++){
            total += scores[i][j];
            }
            average = (double) total / scores[i].length;
            System.out.println((i + 1) + "번 학생 평균: " + average);
            System.out.println(" ");

                if (average >= 80) {
                    count += 1;
                }
            }
        System.out.println("평균 80점 이상 학생: " + count + "명");
        }
    }
