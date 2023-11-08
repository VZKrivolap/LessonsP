package Loops;

//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.

import java.util.Scanner;

public class Task6While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int current = 0;
        func(number, sum, current);
    }

    public static void func(int number, int sum, int current){
        while (number != 0) {
            current = number % 10;
            if (current % 2 == 0) {
                sum += current;
                }
            number = number / 10;
        }
        System.out.println(sum);
    }
}