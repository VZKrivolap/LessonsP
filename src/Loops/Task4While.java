package Loops;
//Вычислить факториал числа, которое ввел пользователь.

import java.util.Scanner;

public class Task4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        int a = 1;
        System.out.println(func(a, factorial));
    }

    public static int func(int a, int factorial){
        int i = 0;
        while (i<factorial){
           a=a*factorial;
           i++;
        }
        return a;
    }
}
