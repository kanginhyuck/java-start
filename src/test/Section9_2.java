package test;

import java.util.Arrays;

public class Section9_2 {

    public static void main(String[] args) {
        int[] scores = {80, 90, 75, 100, 85};

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("합계: " + total);
        double average = total / scores.length;
        System.out.println("평균: " + average);
    }
}
