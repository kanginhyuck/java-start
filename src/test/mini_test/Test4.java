package test.mini_test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이: ");
        int age = scanner.nextInt();
        System.out.print("키: ");
        int height = scanner.nextInt();

        if (age >= 12 && age <= 65 && height >= 140) {
            System.out.println("탑승 가능");
        } else if (age >= 12 && age <= 65 && height < 140) {
            System.out.println("탑승 불가능");
            System.out.println("키");
        } else if ((age < 12 || age > 65) && height >= 140) {
            System.out.println("탑승 불가능");
            System.out.println("나이");
        } else {
            System.out.println("탑승 불가능");
        }

        if(age >= 12 && age <= 65){
            if(height >= 140){
                System.out.println("탑승 가능");
            }
            else {
                System.out.println("탑승 불가능");
                System.out.println("키");
            }
        }else {
            if(height >= 140){
                System.out.println("탑승 불가능");
                System.out.println("나이");
            }
            else {
                System.out.println("탑승 불가능");
            }
        }
    }
}
