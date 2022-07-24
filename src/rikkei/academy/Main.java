package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        boolean isLeapYear = true;

        boolean isDivisbleBy4 = year %4 == 0;
        boolean isDivisbleBy100 = year %100 == 0;
        boolean isDivisbleBy400 = year %400 == 0;

        if (isDivisbleBy4) {
            if(isDivisbleBy100){
                if (isDivisbleBy400){
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if(isLeapYear){
            System.out.printf("%d is the leap year", year);
        } else {
            System.out.printf("%d is NOT the leap year", year);
        }
    }
}