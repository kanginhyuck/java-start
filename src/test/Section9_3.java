package test;

public class Section9_3 {

    public static void main(String[] args) {
        int[] numbers = {13, 7, 25, 9, 18, 30, 4};
        int count = 0;
        int minNumber, maxNumber;
        minNumber = maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println("최댓값: " + maxNumber);
        System.out.println("최솟값: " + minNumber);
        System.out.println("짝수 개수: " + count);
    }
}
