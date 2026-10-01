package test;

public class Section10_6 {

    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        System.out.println(getTotal(scores));
        System.out.println(getAverage(scores));
        System.out.println(getGrade(scores));
    }

    public static int getTotal(int[] scores) {
        int getTotal = 0;
        for (int i = 0; i < scores.length; i++) {
            getTotal += scores[i];
        }
        return getTotal;
    }
    public static double getAverage(int[] scores) {
        double getAverage = (double) getTotal(scores) / scores.length;
        return getAverage;
    }
    public static String getGrade(int[] scores) {
        String grade = "";
        if (getAverage(scores) >= 90) {
            grade = "A";
        } else if (getAverage(scores) >= 80) {
            grade = "B";
        } else if (getAverage(scores) >= 70) {
            grade = "C";
        } else if (getAverage(scores) >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
// 어디에 어떤 문법을 써야하는지는 내가 생각해 냈지만 코드를 작성하는건 인텔리제이가 해줌
