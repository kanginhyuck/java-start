package test;

public class Section10_4 {

    public static void main(String[] args) {
        int[] numbers = {10, 7, 25, 9, 18};
        System.out.println(findMax(numbers));

    }

    public static int findMax(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
