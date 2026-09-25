package test;

public class Section7_4 {

    public static void main(String[] args) {
        int korean = 85;
        int english = 92;
        int math = 76;

        int total = korean + english + math;
        double average = (double) total / 3;
        System.out.println("총점 = " + total);
        System.out.println("평균 = " + average);
    }
}
