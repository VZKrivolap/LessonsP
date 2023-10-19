package Loops;

// Написать программу, которая возводит число в целочисленную степень. Число и степень вводятся с клавиатуры.

import java.util.Scanner;

public class Task3While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int stepen = scanner.nextInt();
        int result = 1;
        int i = 0;

       do {
            result=result*number;
            System.out.println(result);
            i++;
        }  while (i<stepen);
    }
}