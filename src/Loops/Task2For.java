package Loops;
// Вывести на экран кубы чисел от A до B, которые вводит пользователь.

import java.util.Scanner;

public class Task2For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        for (x=x; x<n;x++){
            System.out.println(x*x*x);
        }
    }
}
