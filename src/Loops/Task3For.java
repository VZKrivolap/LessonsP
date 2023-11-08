package Loops;

// Написать программу, которая возводит число в целочисленную степень. Число и степень вводятся с клавиатуры.

import java.util.Scanner;

public class Task3For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int stepen = scanner.nextInt();
        int result = 1;
        func(number, stepen, result);
    }

    public static void func(int number, int stepen, int result){
        for(int i = 0; i<stepen; i++){
            result=result*number;
            System.out.println(result);
        }
    }
}
