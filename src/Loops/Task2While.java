package Loops;
// Вывести на экран кубы чисел от A до B, которые вводит пользователь.

import java.util.Scanner;

public class Task2While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        while (x<n){
            System.out.println(x*x*x);
            x++;
        }
    }
}
